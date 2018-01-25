package com.prajwal.dagger2.java.model;

import javax.inject.Inject;

/**
 * Created by prajwal on 1/25/18.
 */

public class Ola {
    private String name="test";

    @Inject
    public Ola() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
