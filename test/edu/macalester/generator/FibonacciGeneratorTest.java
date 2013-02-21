package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciGeneratorTest {

    @Test
    public void generatorFibonacci() {
        FibonacciGenerator gen = new FibonacciGenerator();
        assertEquals(1, gen.next(), 0.00001);
        assertEquals(2, gen.next(), 0.00001);
        assertEquals(3, gen.next(), 0.00001);
        assertEquals(5, gen.next(), 0.00001);
        assertEquals(8, gen.next(), 0.00001);
        assertEquals(13, gen.next(), 0.00001);
    }

    
}

