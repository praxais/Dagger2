package com.prajwal.dagger2.java.model;

import javax.inject.Inject;

/**
 * Created by prajwal on 1/25/18.
 */

public class MyModel extends MyModelI {

    @Inject
    public MyModel(Test2 test2, Ola ola) {
        super(test2, ola);
    }

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }
}
