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
    public void testDivide() {
   

        



        Calculator c1 = new Calculator(1, 0);
        assertThrows(ArithmeticException.class, () -> c1.divide());

        Calculator c2 = new Calculator(4, 2);
        assertNotEquals(4, c2.divide());
        assertEquals(2, c2.divide());

        Calculator c3 = new Calculator(6, 3);
        assertEquals(2, c3.divide());
        assertDoesNotThrow(() -> (new Calculator(10, 3)).divide());
}

}
    
