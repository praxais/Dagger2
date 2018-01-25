package com.prajwal.dagger2.java.model;

import javax.inject.Inject;

/**
 * Created by prajwal on 1/25/18.
 */

public class Test2 {
    private Test test;

    @Inject
    public Test2(Test test) {
        this.test = test;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
