package com.mathscs.spring.boot.demo.mysql.model;

/**
 * TODO: description
 * Date: 2018-03-28
 *
 * @author caizhenhua
 */
public class User {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
