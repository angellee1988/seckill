package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by zangyaoyi on 2017/8/22.
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     *查询
     * @param seckillID
     * @return
     */
    Seckill queryById(long seckillID);

    /**
     * 根据偏移量查询列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offset,int limit);

}
