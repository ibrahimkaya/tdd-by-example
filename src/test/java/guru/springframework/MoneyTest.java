package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @Author ibrahim
 * @create 1.10.2020 19:48
 */
public class MoneyTest {

    @Test
    void testMultiplicationDollar(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(6));
        assertNotEquals(Money.dollar(2),Money.franc(2));
    }

    @Test
    void testMultiplicationFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(6));
    }

    @Test
    void testCurrency(){
        assertEquals(Money.dollar(1).currency(),"USD");
        assertEquals(Money.franc(1).currency(), "CHF");
    }
}
