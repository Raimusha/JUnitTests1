package Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.ArithmeticException;

public class CalculatorTest {
    Calculator c1 = new Calculator(2, 3);
    Calculator c2 = new Calculator(-2, 3);
    Calculator c3 = new Calculator(2, -3);
    Calculator c4 = new Calculator(-2, -3);
    Calculator c5 = new Calculator(0, 0);
    Calculator c6 = new Calculator(0, 3);
    Calculator c7 = new Calculator(2, 0);
    Calculator c8 = new Calculator(0, -3);
    Calculator c9 = new Calculator(-2, 0);


    @Test
    public void testAdd() {
        assertEquals(c1.add(), 5);
    }
    @Test
    public void testSubtract() {
        assertEquals(c2.subtract(), -5);
    }
    @Test
    public void testMultiply() {
        assertEquals(c3.multiply(), -6);
    }
    @Test
    public void divide() throws ArithmeticException {
        if (c4.rhs == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        assertEquals(c4.divide(), 0.666);
    }
}

