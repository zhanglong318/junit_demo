package com.test.junit;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Calculator2Test {

    @Test
    public void testAdd() {
        try {
            Calculator2 cal2 = new Calculator2();

            Class<Calculator2> clazz = Calculator2.class;
            Method method = clazz.getDeclaredMethod("add", new Class[]{
                    Integer.TYPE, Integer.TYPE});
            method.setAccessible(true);//important

            Object result = method.invoke(cal2, new Object[]{1, 2});

            assertEquals(3, result);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }
}
