package edu.macalester.generator;


public class FibonacciGenerator {
    private double a = 0;
    private double b = 1;
    
    public FibonacciGenerator() {
    }
    
    public double next() {
    	double c = a + b;
    	a = b;
    	b = c;
    	return c;
    
    	}


    			
    
}