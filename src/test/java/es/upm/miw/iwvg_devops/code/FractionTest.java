package es.upm.miw.iwvg_devops.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 5);
    }

    @Test
     void testDecimal() {
        assertEquals(0.4, fraction.decimal(), 0.001);
    }

    @Test
    void testIsproper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(2, 5);
        Fraction fraction2 = new Fraction(7, 2);
        assertTrue(fraction.isEquivalent(fraction1));
        assertFalse(fraction.isEquivalent(fraction2));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction sum = fraction.add(fraction1);
        assertEquals(23, sum.getNumerator());
        assertEquals(20, sum.getDenominator());

    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(2, 8);
        Fraction product = fraction.multiply(fraction1);
        assertEquals(4, product.getNumerator());
        assertEquals(40, product.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(1, 3);
        Fraction div = fraction.divide(fraction1);
        assertEquals(6, div.getNumerator());
        assertEquals(5, div.getDenominator());

    }


}
