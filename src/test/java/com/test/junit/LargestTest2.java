package com.test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class LargestTest2 {

    private Largest largest;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        largest = new Largest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetLargest() {
        int[] array = {1, 9, 10, -20, 23};

        int result = 0;

        try {
            result = largest.getLargest(array);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }

        assertEquals(23, result);
    }

    @Test(expected = Exception.class)
    public void testLargest2() throws Exception {
        largest.getLargest(null);
    }

    @Test(expected = Exception.class)
    @Ignore("This case is ignored")
    public void testLargest3() throws Exception {
        largest.getLargest(new int[]{});
    }

}
