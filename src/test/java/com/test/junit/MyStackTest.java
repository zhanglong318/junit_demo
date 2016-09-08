package com.test.junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MyStackTest extends TestCase {

    private MyStack myStack;

    public void setUp() {
        myStack = new MyStack();
    }

    public void testPush() {
        try {
            myStack.push("hello world");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String result = null;
        try {
            result = myStack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals("hello world", result);
    }

    public void testPush2() {
        for (int i = 0; i < 100; ++i) {
            try {
                myStack.push(i + "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 100; ++i) {
            String result = null;
            try {
                result = myStack.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }

            Assert.assertEquals((99 - i) + "", result);
        }
    }

    public void testPush3() {
        Throwable tx = null;

        try {
            for (int i = 0; i <= 100; ++i) {
                myStack.push(i + "");
            }

            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
            tx = e;
        }

        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("数组越界异常!", tx.getMessage());
    }

    public void testPop() {
        Throwable tx = null;

        try {
            myStack.pop();
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
            tx = e;
        }
        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("数组越界异常!", tx.getMessage());
    }

    public void testTop() {
        try {
            myStack.push("hello world");
            String result = myStack.top();
            Assert.assertEquals("hello world", result);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail();
        }
    }

    public void testTop2() {
        Throwable tx = null;

        try {
            myStack.top();
            Assert.fail();
        } catch (Exception e) {
            e.printStackTrace();
            tx = e;
        }
        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("数组越界异常!", tx.getMessage());
    }

    public void testDelete() {
        try {
            for (int i = 0; i < 10; ++i) {
                myStack.push(i + "");
            }

            myStack.delete(10);
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail();
        }
    }

    public void testDelete2() {
        Throwable tx = null;

        try {
            for (int i = 0; i < 10; ++i) {
                myStack.push(i + "");
            }

            myStack.delete(11);
            myStack.push("hello world");
        } catch (Exception ex) {
            ex.printStackTrace();
            tx = ex;
        }

        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class, tx.getClass());
        Assert.assertEquals("数组越界异常!", tx.getMessage());
    }

}
