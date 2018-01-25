package com.prajwal.dagger2.java.model;

import javax.inject.Inject;

/**
 * Created by prajwal on 1/25/18.
 */

public class Test {
    private String name;

    @Inject
    public Test() {
        this.name = "test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
