package com.test.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {

    private int expected;

    private int input1;

    private int input2;

    @Parameters
    @SuppressWarnings("unchecked")
    public static Collection prepareData() {
        Object[][] object = {{3, 1, 2}, {-4, -1, -3},
                {6, -3, 9}, {4, 8, -4}};

        return Arrays.asList(object);
    }

    public ParameterTest(int expected, int input1, int input2) {
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        assertEquals(expected, cal.add(input1, input2));
    }

}
