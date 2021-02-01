package com.vogella.maven.first;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    @Test
    @Tag("slow")
    void addition() {
        assertTrue(true);
    }
}