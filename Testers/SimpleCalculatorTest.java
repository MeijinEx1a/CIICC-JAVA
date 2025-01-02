import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;

public class SimpleCalculatorTest {
    @Test
    void testAdd() {
        var calculator = new SimpleCalculator();
        //calculator.add(2,2);
        assertEquals(4,calculator.add(2, 2));
    }
}
