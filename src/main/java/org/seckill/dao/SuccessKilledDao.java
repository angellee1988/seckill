package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by zangyaoyi on 2017/8/22.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的结果行数
     */
    int insertSuccessKilled(long seckillId, long userPhone);


    /**
     * 根据ID查询对象并携带秒杀对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIDWithSeckill(long seckillId);
}
