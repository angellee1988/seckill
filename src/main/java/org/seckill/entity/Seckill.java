package org.seckill.entity;

import com.google.common.base.Objects;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zangyaoyi on 2017/8/22.
 */
public class Seckill implements Serializable {
    private long seckillID;
    private String name;
    private int number;
    private Date startTime;
    private Date endTime;
    private Date createTime;

    public long getSeckillID() {
        return seckillID;
    }

    public void setSeckillID(long seckillID) {
        this.seckillID = seckillID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("seckillID", seckillID)
                .add("name", name)
                .add("number", number)
                .add("startTime", startTime)
                .add("endTime", endTime)
                .add("createTime", createTime)
                .toString();
    }
}
