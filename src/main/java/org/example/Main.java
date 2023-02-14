package org.example;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Class> extendedClasses = new ArrayList<>();

        //Main class we searching for
        Class xClass = X.class;
        //Sub classes we looking  in which package
        Reflections reflections = new Reflections("org.example.subclass2");
        Set<Class<? extends X>> subClasses = reflections.getSubTypesOf(xClass);

        for (Class<? extends X> subClass : subClasses) {
            extendedClasses.add(subClass);
        }
        for (Class x : extendedClasses) {
            X mobj = X.class.cast(x);
            mobj.run();
        }

        extendedClasses.stream().forEach(x -> System.out.println(x.getName()));

    }
}