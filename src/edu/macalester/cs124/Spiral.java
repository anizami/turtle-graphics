package edu.macalester.cs124;

import java.awt.Color; 

import edu.macalester.generator.FibonacciGenerator;
import edu.macalester.generator.PrimeGenerator;
import edu.macalester.generator.SteppingGenerator;
import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class Spiral extends TurtleProgram {
    public void run() {
    	spiral(Color.RED, 90);
    	spiral(Color.BLUE, 90.1);

    	
    }
    
    private void spiral(Color color, double angle) {
        setTurtleSpeedFactor(0);
        
        SteppingGenerator gen = new SteppingGenerator(2, 1.5);
        
        Turtle turtle = new Turtle(getWidth() / 2, getHeight() / 2);
        add(turtle);
        turtle.setColor(color);
        turtle.setStepSize(1);
        
        
        while(turtleIsNearScreen(turtle)) {
            turtle.forward(gen.next());
            turtle.left(angle);
        }
        remove(turtle);
        
        println("Done!");
    }

    private boolean turtleIsNearScreen(Turtle turtle) {
        double margin = Math.max(getWidth(), getHeight()) / 2;
        return turtle.getX() > -margin
            && turtle.getY() > -margin
            && turtle.getX() < getWidth()  + margin
            && turtle.getY() < getHeight() + margin;
    }
}
