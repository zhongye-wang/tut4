import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        int a = 13;
        int b = 23;
        assertEquals(36, Calc.add(a,b));
    }

    @Test
    void subtract() {
        int a = 34;
        int b = 22;
        assertEquals(12,Calc.subtract(a,b));
    }
}