package com.timetowords;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpeakingClockTest {
    SpeakingClock t = new SpeakingClock();
    @Test
    public void convertNumberToWord() {
        String s = t.convertTimeToWords("14:34");
        assertEquals(s,"It's fourteen thirty four");
    }
    
    @Test
    public void shouldReturnInvalidTime(){
        String s = t.convertTimeToWords("25:34");
        assertEquals(s,"Time mentioned is not in Time format");
    }
}