package be.craftcode.ap.switches;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Java21SwitchPatternMatchingTest {
    Java21SwitchPatternMatching java21SwitchPatternMatching = new Java21SwitchPatternMatching();

    @Test
    void givenObjectOldCheckObjectShouldReturnCorrectString(){
        assertEquals("int 3", java21SwitchPatternMatching.oldCheckObject(3));
        assertEquals("long 3", java21SwitchPatternMatching.oldCheckObject(3L));
        assertEquals("double 3.000000", java21SwitchPatternMatching.oldCheckObject(3.0));
        assertEquals("Object String", java21SwitchPatternMatching.oldCheckObject("String"));
        assertEquals("null", java21SwitchPatternMatching.oldCheckObject(null));
    }

    @Test
    void givenObjectCheckObjectShouldReturnCorrectString(){
        assertEquals("int 3", java21SwitchPatternMatching.checkObject(3));
        assertEquals("long 3", java21SwitchPatternMatching.checkObject(3L));
        assertEquals("double 3.000000", java21SwitchPatternMatching.checkObject(3.0));
        assertEquals("Object String", java21SwitchPatternMatching.checkObject("String"));
        assertEquals("null", java21SwitchPatternMatching.checkObject(null));
    }

    @Test
    void testTestStringOld() {
        assertEquals("null", java21SwitchPatternMatching.testStringOld(null));
        assertEquals("You got it", java21SwitchPatternMatching.testStringOld("YES"));
        assertEquals("You got it", java21SwitchPatternMatching.testStringOld("yes"));
        assertEquals("You got it", java21SwitchPatternMatching.testStringOld("Y"));
        assertEquals("You got it", java21SwitchPatternMatching.testStringOld("y"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringOld("NO"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringOld("no"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringOld("N"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringOld("n"));
        assertEquals("Sorry?", java21SwitchPatternMatching.testStringOld("Maybe"));
        assertEquals("Sorry?", java21SwitchPatternMatching.testStringOld("ABC"));
    }

    @Test
    void testStringWithGuards() {
        assertEquals("null", java21SwitchPatternMatching.testStringWithGuards(null));
        assertEquals("You got it", java21SwitchPatternMatching.testStringWithGuards("YES"));
        assertEquals("You got it", java21SwitchPatternMatching.testStringWithGuards("yes"));
        assertEquals("You got it", java21SwitchPatternMatching.testStringWithGuards("Y"));
        assertEquals("You got it", java21SwitchPatternMatching.testStringWithGuards("y"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringWithGuards("NO"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringWithGuards("no"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringWithGuards("N"));
        assertEquals("Shame", java21SwitchPatternMatching.testStringWithGuards("n"));
        assertEquals("Sorry?", java21SwitchPatternMatching.testStringWithGuards("Maybe"));
        assertEquals("Sorry?", java21SwitchPatternMatching.testStringWithGuards("ABC"));
    }

    @Test
    void testDominance(){
        assertEquals("It's the letter 'y'!", java21SwitchPatternMatching.testDominance("y"));
        assertEquals("It's a string: Maybe", java21SwitchPatternMatching.testDominance("Maybe"));
    }


}
