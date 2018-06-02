package calculator;

import calculator.actions.Actions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sun.plugin2.message.Message;

public class MainTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();
    private static Actions calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Actions();
    }


    @Test
    public void testaddNumbers() {
        //given
        double firstNumber = 10;
        double secondNumber = 6;
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
    public void testDivide() throws InvilidNumberExeptioon {
        //given
        double firstNumber = 20;
        double secondNumber = 5;
        double expectedResult = 4;
        //when
        double result = calculator.division(firstNumber, secondNumber);
        //
        Assert.assertTrue(result == expectedResult);
    }

    @Test(expected = InvilidNumberExeptioon.class)
    public void testDivideWithExpected() throws InvilidNumberExeptioon {
        //given
        double firstNumber = 6;
        double secondNumber = 0;
        //when
        double result = calculator.division(firstNumber, secondNumber);
    }

    @Test
    public void testDivideWithExpectedSecond() throws InvilidNumberExeptioon {
        //given
        double firstNumber = 6;
        double secondNumber = 0;
        expected.expect(InvilidNumberExeptioon.class);
        expected.expectMessage("do not divide by zero");
        //when
        calculator.division(firstNumber, secondNumber);
    }

    @Test
    public void testDivideWithExpectionThird() throws InvilidNumberExeptioon {
        //given
        double firstNumber = 6;
        double secondNumber = 0;
        try {
            calculator.division(firstNumber, secondNumber);
            Assert.fail("do not divide by zero");
        } catch (InvilidNumberExeptioon invilidNumberExeptioon) {

        }
    }
}