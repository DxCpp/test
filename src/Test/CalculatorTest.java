package Test;

import Java.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sumFloats() {
        float sum = calculator.sum(3f, 1f);
        Assertions.assertEquals(4f,sum);
        sum = calculator.sum(4f, 7f);
        Assertions.assertEquals(11f,sum);
    }
}