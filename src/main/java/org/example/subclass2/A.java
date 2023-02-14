package org.example.subclass2;

import org.example.X;

public class A extends X {
    @Override
    public void run() {
        System.out.println("This is Class : " + this.getClass().getName());
    }
}
