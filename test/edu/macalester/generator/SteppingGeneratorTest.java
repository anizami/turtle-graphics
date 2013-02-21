package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;


public class SteppingGeneratorTest {

    @Test
    public void generatorWorks() {
        SteppingGenerator gen = new SteppingGenerator(1, 2);
        assertEquals(1, gen.next(), 0.00001);
        assertEquals(3, gen.next(), 0.00001);
        assertEquals(5, gen.next(), 0.00001);
        assertEquals(7, gen.next(), 0.00001);
    }

}

