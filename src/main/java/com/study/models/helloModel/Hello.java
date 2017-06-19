package com.study.models.helloModel;

import com.study.models.base.BaseModel;

import javax.persistence.Entity;

/**
 * Created by zbl on 2017/6/19.
 */
@Entity
public class Hello extends BaseModel {
    private String aaa;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }
}
