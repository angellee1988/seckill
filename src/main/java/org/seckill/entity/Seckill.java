package org.seckill.entity;

import java.util.Date;

/**
 * Created by zangyaoyi on 2017/8/22.
 */
public class Seckill {
    private long seckillID;
    private String name;
    private int number;
    private Date start_time;
    private Date end_time;
    private Date create_time;

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

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return com.google.common.base.Objects.toStringHelper(this)
                .add("seckillID", seckillID)
                .add("name", name)
                .add("number", number)
                .add("start_time", start_time)
                .add("end_time", end_time)
                .add("create_time", create_time)
                .toString();
    }

}
