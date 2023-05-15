package com.example.calculatortest.service;

import com.example.calculatortest.exception.ZeroDivideException;
import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorImpl implements ServiceCalculator{
    public int sum(int a, int b){
        return a + b;
    }
    public int min(int a, int b){
        return a - b;
    }
    public int multi(int a, int b){
        return a * b;
    }
    public double div(int a, int b){
        if (b==0) {
            throw new ZeroDivideException();
        }
        return (double) a / b;
    }
}
