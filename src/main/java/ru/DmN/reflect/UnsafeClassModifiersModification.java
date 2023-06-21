package ru.DmN.reflect;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeClassModifiersModification {
    static Unsafe getUnsafe() {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            return (Unsafe) f.get(null);
        } catch (Exception ignored)
        {
            return null;
        }
    }

    public static void modify(Class<?> klass, Class<?> modifiers) {
        var unsafe = getUnsafe();
        unsafe.putLong(klass, 16L, unsafe.getLong(modifiers, 16L));
    }
}
