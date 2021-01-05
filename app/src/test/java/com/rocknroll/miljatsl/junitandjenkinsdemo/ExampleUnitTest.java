package com.rocknroll.miljatsl.junitandjenkinsdemo;

import android.app.Activity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        CalculatorClass calculatorClass = new CalculatorClass();
        assertEquals(4, calculatorClass.sumNumbers(2, 2));
    }
}