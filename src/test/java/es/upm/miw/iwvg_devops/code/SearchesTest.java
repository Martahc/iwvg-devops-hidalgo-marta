package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(List.of(2.0,-0.2,0.5,1.3333333333333333), new Searches().findDecimalFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }


    @Test
    void testFindUserFamilyNameBySomeImproperFraction(){
        assertEquals(List.of("Fernandez","Blanco","López","Blanco","Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserIdByAllProperFraction(){
        assertEquals(List.of(), new Searches().findUserIdByAllProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionDivisionByUserId(){
        Fraction fractionExpected = new Fraction(120,-8);
        Fraction fractionActual = new Searches().findFractionDivisionByUserId("2");
        assertEquals(fractionExpected.getNumerator(), fractionActual.getNumerator());
        assertEquals(fractionExpected.getDenominator(), fractionActual.getDenominator());

    }

}