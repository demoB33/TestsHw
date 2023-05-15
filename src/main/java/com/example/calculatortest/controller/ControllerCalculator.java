package com.example.calculatortest.controller;

import com.example.calculatortest.service.ServiceCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    private final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a)||Objects.isNull(b)) {
            return "Введите 2 параметра";
        }
        return a + " + " + b + " = " + serviceCalculator.sum(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a)||Objects.isNull(b)) {
            return "Введите 2 параметра";
        }
        return a + " - " + b + " = " + serviceCalculator.min(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a)||Objects.isNull(b)) {
            return "Введите 2 параметра";
        }
        return a + " * " + b + " = " + serviceCalculator.multi(a, b);

    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a)||Objects.isNull(b)) {
            return "Введите 2 параметра";
        }

        return a + " / " + b + " = " + serviceCalculator.div(a, b);
    }


}
