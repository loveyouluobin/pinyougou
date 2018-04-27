package com.pinyougou.pojo;

import java.io.Serializable;

public class TbBrand implements Serializable {
    private Long id;//id主键

    private String name;//品牌名

    private String firstChar;//品牌首字母


    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }
}