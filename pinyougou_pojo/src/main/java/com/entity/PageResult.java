package com.entity;

import java.util.List;

public class PageResult {
  private Long total;//总记录数
  private List rows;//分页数据列表

    public PageResult() {
    }

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
