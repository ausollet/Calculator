package Test_Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Calculator.Calculator;

public class TestCalculator
{
    private Calculator calculator;

    @Before
    public void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    public void test_sqrt()
    {
        double Input = 176400;
        double Desired_Output = 420.0;
        double Output = calculator.sqrt(Input);
        Assert.assertEquals(Desired_Output, Output, 0.0000000007);
    }

    @Test
    public void test_log() {
        double Input = 69;
        double Desired_Output = 4.2341065046;
        double Output = calculator.log(Input);
        Assert.assertEquals(Desired_Output, Output, 0.0000000007);
    }

    @Test
    public void test_power() {
        double Input1 = 22667121;
        double Input2 = 0.25;
        double Desired_Output = 69.0;
        double Output = calculator.power(Input1, Input2);
        Assert.assertEquals(Desired_Output, Output, 0.0000000007);
    }

    @Test
    public void test_factorial() {
        int Input = 8;
        int Desired_Output = 40320;
        int Output = calculator.factorial(Input);
        Assert.assertEquals(Desired_Output, Output);
    }
}
