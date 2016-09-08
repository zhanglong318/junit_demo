package com.test.junit;

import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestRepeated extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite();

		suite.addTest(new RepeatedTest(new CalculatorTest("testAdd"), 100));

        return suite;
    }
}
