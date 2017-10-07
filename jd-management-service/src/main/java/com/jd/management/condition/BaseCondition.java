package com.jd.management.condition;

/**
 * @Description:
 * @Author: jiaodong
 * @Date: Created on 2017/10/07 下午 5:11.
 */
public class BaseCondition {

    /**
     * 起始记录数
     */
    private int begin;

    /**
     * 每页记录数
     */
    private int rows;

    /**
     * 当前第几页
     */
    private int page;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getBegin() {
        begin = (page - 1) * rows;
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }
}
