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
    void testFullName() {
        assertEquals("Marta Hidalgo", user.fullName());
    }

    @Test
     void testInitials() {
        assertEquals("M.", user.initials());
    }
}


