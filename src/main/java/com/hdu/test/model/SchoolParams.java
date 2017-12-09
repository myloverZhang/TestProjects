package com.hdu.test.model;

import java.io.Serializable;

/**
 * Created by CTWLPC on 2017/8/29.
 */
public class SchoolParams implements Serializable{
    private String name;
    private String location;

    public SchoolParams() {
    }

    public SchoolParams(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "SchoolParams{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
