package es.upm.miw.iwvg_devops.code;

import java.util.ArrayList;
import java.util.List;
import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;


public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User("1", "Marta", "Hidalgo", new ArrayList<Fraction>());
    }

    @Test
    void testGetName() {
        assertEquals("Marta", user.getName());
    }


    @Test
    void testGetFamilyName() {
        assertEquals("Hidalgo", user.getFamilyName());
    }


    @Test
    void testGetFractions() {
        List<Fraction> fractions = user.getFractions();
        assertEquals(0, fractions.size());
    }

    @Test
     void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction(2, 5));
        newFractions.add(new Fraction(3, 4));
        newFractions.add(new Fraction(7, 9));
        user.setFractions(newFractions);

        List<Fraction> fractions = user.getFractions();
        assertEquals(3, fractions.size());
        assertEquals(new Fraction(2, 5), fractions.get(0));
        assertEquals(new Fraction(7, 9), fractions.get(2));
    }


    @Test
    void testFullName() {
        assertEquals("Marta Hidalgo", user.fullName());
    }

    @Test
     void testInitials() {
        assertEquals("M.", user.initials());
    }
}


