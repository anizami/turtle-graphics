package edu.macalester.generator;

public class SteppingGenerator {
	
    private double cur;
    private double step;
    
    public SteppingGenerator(double start, double instep) {
        cur = start;
        step = instep;
        // another tip we can use is instead call the argument 'step' as well instead of
        // 'instep'. When we're using the assignment statement, to assign the input value
        // to the instance variable 'step' by saying 'this.step = step'. 'this.step' tells
        // the code that this is referring to the object's instance variable and step is
        // only referring to the step variable inside that method. 
        
    }

    public double next() {
//    	remember the value of cur; that is the result
    	double result = cur;
    	cur += step;
    	return result;
    }
}



