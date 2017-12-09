package com.hdu.test.model;

/**
 * Created by CTWLPC on 2017/8/28.
 */
public class StudentsInfo {
    private String name;
    private Integer age;

    public StudentsInfo() {
    }

    public StudentsInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentsInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
