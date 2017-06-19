package com.study.models.helloModel;

import com.study.models.base.BaseModel;

import javax.persistence.Entity;

/**
 * Created by zbl on 2017/6/19.
 */
@Entity
public class Hello extends BaseModel {
    private String world;

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
