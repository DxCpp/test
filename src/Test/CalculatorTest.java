package Test;

import Java.Calculator;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sumFloats() {
        float num1=2;
        float num2=2;
        float sum = calculator.sum(num1, num2);

        Assertions.assertEquals(4f,sum);
    }
}