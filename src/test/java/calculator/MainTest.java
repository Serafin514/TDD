package calculator;

import calculator.actions.Actions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

    private static Actions calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Actions();
    }


    @Test
    public void testaddNumbers() {
        //given
        double firstNumber = 10;
        double secondNumber= 6;
        double expectedResult = 16;
        //when
        double result = calculator.addNumbers(firstNumber, secondNumber);
        //then
        Assert.assertTrue(result == expectedResult);
    }

    @Test
    public void testaddSubstractions() {
        //given
        double firstNumber = 10;
        double secondNumber = 6;
        double expectedResult = 4;
        //when
        double result = calculator.substractions(firstNumber, secondNumber);
        //then
        Assert.assertTrue(result == expectedResult);
    }

    @Test
    public void testMultiply() {
        //given
        double firstNumber = 4;
        double secondNumber = 5;
        double expectedResult = 20;
        //when
        double result = calculator.multiply(firstNumber, secondNumber);
        //then
        Assert.assertTrue(result == expectedResult);
    }

    @Test
    public void testDivision() {
        //given
        double firstNumber =  20;
        double secondNumber = 5;
        double expectedResult = 4;
        //when
        double result = calculator.division(firstNumber , secondNumber);
        //
        Assert.assertTrue(result == expectedResult);
    }

}