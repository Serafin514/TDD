package calculator.actions;

import calculator.InvilidNumberExeptioon;

public class Actions {

    public double substractions(Double a, Double b) {
        return a - b;
    }

    public double addNumbers(Double a, Double b) {
        return a + b;
    }

    public double multiply(Double a, Double b) {
        return a * b;
    }

    public double division(Double a, Double b) throws InvilidNumberExeptioon{
        if (b==0){
            throw new InvilidNumberExeptioon("do not divide by zero");
        }
        return a / b;
    }
}