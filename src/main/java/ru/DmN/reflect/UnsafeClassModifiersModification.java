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

    public static void modify(Class<?> klass, int modifiers) {
        var unsafe = getUnsafe();
        unsafe.putInt(unsafe.getLong(klass, 16L) + 16L, modifiers);
    }
}
