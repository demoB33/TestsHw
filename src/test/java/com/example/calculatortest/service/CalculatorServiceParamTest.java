package com.example.calculatortest.service;

import com.example.calculatortest.exception.ZeroDivideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {
    private final ServiceCalculatorImpl serviceCalculatorImpl = new ServiceCalculatorImpl();
    public static Stream<Arguments> plusTestParams() {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(-10,5,-5)
        );
    }
    public static Stream<Arguments> minTestParams() {
        return Stream.of(
                Arguments.of(1,2,-1),
                Arguments.of(-10,5,-15)
        );
    }
    public static Stream<Arguments> multiTestParams() {
        return Stream.of(
                Arguments.of(1,2,2),
                Arguments.of(-1,5,-5)
        );
    }
    public static Stream<Arguments> divTestParams() {
        return Stream.of(
                Arguments.of(1,2,0.5),
                Arguments.of(6,3,2)
        );
    }
    public static Stream<Arguments> divNegativeTestParams() {
        return Stream.of(
                Arguments.of(1,0),
                Arguments.of(6,0)
        );
    }

    @ParameterizedTest
    @MethodSource("plusTestParams")
    public void sumTest(int a, int b, int expected) {
        int actual = serviceCalculatorImpl.sum(a, b);

        Assertions.assertEquals(actual, expected);

    }

    @ParameterizedTest
    @MethodSource("minTestParams")
    public void minTest(int a, int b, int expected) {
        int actual = serviceCalculatorImpl.min(a, b);

        Assertions.assertEquals(actual, expected);

    }

    @ParameterizedTest
    @MethodSource("multiTestParams")
    public void multiTest(int a, int b, int expected) {
        int actual = serviceCalculatorImpl.multi(a, b);

        Assertions.assertEquals(actual, expected);

    }

    @ParameterizedTest
    @MethodSource("divTestParams")
    public void divTest(int a, int b, double expected) {
        double actual = serviceCalculatorImpl.div(a, b);

        Assertions.assertEquals(actual, expected);

    }
    @ParameterizedTest
    @MethodSource("divNegativeTestParams")
    public void divNegativeTest(int a, int b) {

        Assertions.assertThrows(ZeroDivideException.class, ()->serviceCalculatorImpl.div(a,b));
        Assertions.assertThrows(ZeroDivideException.class, ()->serviceCalculatorImpl.div(a,b));

    }

}
