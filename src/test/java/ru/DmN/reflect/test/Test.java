package ru.DmN.reflect.test;

import ru.DmN.reflect.UnsafeClassModifiersModification;

public class Test {
    public static void main(String[] args) {
        var klassA = Test.class;
        System.out.println(klassA.getModifiers());

        UnsafeClassModifiersModification.modify(klassA, Class.class);
        System.out.println(klassA.getModifiers());

        var klassB = Class.class;
        System.out.println(klassB.getModifiers());
//
        UnsafeClassModifiersModification.modify(klassB, Object.class);
        System.out.println(klassB.getModifiers());
    }
}
