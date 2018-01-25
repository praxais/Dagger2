package com.prajwal.dagger2.java.model;

/**
 * Created by prajwal on 1/25/18.
 */

public class MyModelI {
    protected Test2 test2;
    protected Ola ola;

    public MyModelI(Test2 test2, Ola ola) {
        this.test2 = test2;
        this.ola = ola;
    }

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    public Ola getOla() {
        return ola;
    }

    public void setOla(Ola ola) {
        this.ola = ola;
    }
}
