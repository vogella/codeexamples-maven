package com.vogella;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @Tag("slow")
    public void shouldAnswerWithTrue()
    {
    	System.out.println("THIS IS A TEST");
        assertTrue( false );
    }
}
