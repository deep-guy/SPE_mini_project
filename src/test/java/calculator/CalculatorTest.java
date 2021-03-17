import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square root of double number for True Positive", 4.0, calculator.squareRoot(16.0), DELTA);
        assertEquals("Square root of double number for True Positive", 3.0, calculator.squareRoot(9.0), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square root of double number for False Positive", 9.0, calculator.squareRoot(16.0), DELTA);
        assertNotEquals("Square root of double number for False Positive", 9.0, calculator.squareRoot(9.0), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True Positive", 6, calculator.Factorial(3), DELTA);
        assertEquals("Factorial of number for True Positive", 120, calculator.Factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False Positive", 20, calculator.Factorial(3), DELTA);
        assertNotEquals("Factorial of number for False Positive", 121, calculator.Factorial(5), DELTA);
    }

    @Test
    public void nLogTestTP() {
        double ret = Calculator.natlog(2.718);
        assertEquals(1,ret, 0.2f);
    }

    @Test
    public void nLogTestTN() {
        double ret = Calculator.natlog(2.718);
        assertNotEquals(2,ret, 0.2f);
    }

    @Test
    public void powerTestTP() {
        double ret = Calculator.power(2, 2);
        assertEquals(4,ret, 0.0f);
    }

    @Test
    public void powerTestTN() {
        double ret = Calculator.power(2, 2);
        assertNotEquals(5,ret, 0.0f);
    }

}
