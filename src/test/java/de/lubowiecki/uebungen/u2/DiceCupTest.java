package de.lubowiecki.uebungen.u2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    @DisplayName("Ein einzelner Würfelwurf")
    @RepeatedTest(value = 100)
    void roll() {
        int erg = DiceCup.roll();
        assertTrue(erg > 0 && erg <= 6);
    }

    @DisplayName("Ein mehrfacher Würfelwurf")
    @Test
    void multipleRoll() {
        int[] arr = DiceCup.roll(10);
        assertTrue(arr.length == 10);
        for(int i : arr)
            assertTrue(i > 0 && i <= 6);
    }
}