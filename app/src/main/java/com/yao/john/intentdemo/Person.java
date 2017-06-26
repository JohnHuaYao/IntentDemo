package com.yao.john.intentdemo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017-06-26.
 */

public class Person implements Serializable {
    private static final long serialVersionUID = 9198039695835265862L;
    /*姓名*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*年龄*/
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
