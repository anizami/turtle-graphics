package edu.macalester.generator;

public class SteppingGenerator {
	
    private double cur;
    private double step;
    
    public SteppingGenerator(double start, double instep) {
        cur = start;
        step = instep;
    }

    public double next() {
//    	remember the value of cur; that is the result
    	double result = cur;
    	cur += step;
    	return result;
    }
}



