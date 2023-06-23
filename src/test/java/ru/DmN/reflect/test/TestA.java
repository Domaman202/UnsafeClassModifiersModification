package ru.DmN.reflect.test;

import ru.DmN.reflect.UnsafeClassModifiersModification;

import java.lang.reflect.Modifier;

public class TestA {
    public static void main(String[] args) {
        var klassA = TestA.class;
        System.out.println(klassA.getModifiers());

        UnsafeClassModifiersModification.modify(klassA, Modifier.PUBLIC | Modifier.FINAL);
        System.out.println(klassA.getModifiers());

        var klassB = Class.class;
        System.out.println(klassB.getModifiers());

        UnsafeClassModifiersModification.modify(klassB, Modifier.PUBLIC);
        System.out.println(klassB.getModifiers());
    }
}
