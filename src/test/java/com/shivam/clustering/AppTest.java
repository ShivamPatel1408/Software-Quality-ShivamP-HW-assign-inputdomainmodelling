package com.shivam.clustering;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for the App class.
 */
public class AppTest extends TestCase {
    /**
     * Constructor for the test case.
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * Method to create the test suite.
     *
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * A simple test case to verify that the test environment is correctly set up.
     */
    public void testApp() {
        assertTrue(true); // Ensure that true is always true
    }
}
