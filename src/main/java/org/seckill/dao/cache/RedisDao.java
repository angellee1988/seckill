package org.seckill.dao.cache;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import org.seckill.entity.Seckill;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by zangyaoyi on 2017/9/12.
 */
public class RedisDao {
    private JedisPool jedisPool;

    private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);

    public RedisDao(String ip, int port) {
        jedisPool = new JedisPool(ip, port);
    }

    public Seckill getSeckill(long seckillId) {
        //redis操作
        Jedis jedis = jedisPool.getResource();
        //没有实现内部序列化
        //get -->byte[] -->反序列化-->Object(Seckill)
        //自定义序列化
        //protostuff:pojo
        try {
            String key = "seckill:" + seckillId;
            byte[] bytes = jedis.get(key.getBytes());
            if (bytes != null) {
                Seckill seckill = schema.newMessage();
                ProtostuffIOUtil.mergeFrom(bytes, seckill, schema);
                //seckill被反序列
                return seckill;
            }
        } finally {
            jedis.close();
        }
        return null;
    }

    public String putSeckill(Seckill seckill) {
        //set object(seckill)->序列化->byte[]
        Jedis jedis = jedisPool.getResource();

        try {
            String key = "seckill:" + seckill.getSeckillID();
            byte[] bytes = ProtostuffIOUtil.toByteArray(seckill, schema,
                    LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
            int timeout = 60 * 60;//秒
            return jedis.setex(key.getBytes(), timeout, bytes);
        } finally {
            jedis.close();
        }
    }
}
