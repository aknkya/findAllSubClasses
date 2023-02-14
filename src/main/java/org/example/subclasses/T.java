package org.example.subclasses;

import org.example.X;

public class T extends X {

    @Override
    public void run() {
        System.out.println("This is Class : " + this.getClass().getName());
    }
}
