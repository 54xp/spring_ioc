package com.bean;

import java.io.Serializable;

/**
 * @author xp
 * @create 2020-01-06 9:07
 */

public class User {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("name  "+ name );
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
