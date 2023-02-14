package org.example.subclass2;

import org.example.X;

public class C extends X {
    @Override
    public void run() {
        System.out.println("This is Class : " + this.getClass().getName());
    }
}
