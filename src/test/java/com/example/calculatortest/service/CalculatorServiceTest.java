package com.example.calculatortest.service;

import com.example.calculatortest.exception.ZeroDivideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.zip.ZipException;

public class CalculatorServiceTest {
    private final ServiceCalculatorImpl serviceCalculatorImpl = new ServiceCalculatorImpl();

    @Test
    public void sumTest() {
        int actual = serviceCalculatorImpl.sum(1, 2);
        int expected = 3;

        Assertions.assertEquals(actual, expected);

        int actual1 = serviceCalculatorImpl.sum(-1, 9);
        int expected1 = 8;

        Assertions.assertEquals(actual1, expected1);
    }

    @Test
    public void minTest() {
        int actual = serviceCalculatorImpl.min(1, 2);
        int expected = -1;

        Assertions.assertEquals(actual, expected);

        int actual1 = serviceCalculatorImpl.min(-1, 9);
        int expected1 = -10;

        Assertions.assertEquals(actual1, expected1);
    }


    @Test
    public void multiTest() {
        int actual = serviceCalculatorImpl.multi(1, 2);
        int expected = 2;

        Assertions.assertEquals(actual, expected);

        int actual1 = serviceCalculatorImpl.multi(-1, 9);
        int expected1 = -9;

        Assertions.assertEquals(actual1, expected1);
    }

    @Test
    public void divTest() {
        double actual = serviceCalculatorImpl.div(1, 2);
        double expected = 0.5;

        Assertions.assertEquals(actual, expected);

        double actual1 = serviceCalculatorImpl.div(3, 3);
        double expected1 = 1;

        Assertions.assertEquals(actual1, expected1);
    }

    @Test
    public void divNegativeTest() {
        Assertions.assertThrows(ZeroDivideException.class, ()->serviceCalculatorImpl.div(-1,0));
        Assertions.assertThrows(ZeroDivideException.class, ()->serviceCalculatorImpl.div(5,0));
    }

}
