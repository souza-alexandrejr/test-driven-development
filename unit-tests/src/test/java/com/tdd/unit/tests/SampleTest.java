/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tdd.unit.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test void appHasAGreeting() {
        SampleApp classUnderTest = new SampleApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}