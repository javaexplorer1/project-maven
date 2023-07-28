package com.javarush.games.racer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectionTest {

    @Test
    void values() {
        assertEquals(3, Direction.values().length);
    }
}