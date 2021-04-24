package LeetCode.March;

import java.util.Random;

public class RandomPointInCircle {

	double x;
    double y;
    double radius;
    
    static Random rng = new Random();

    public RandomPointInCircle(double radius, double x_center, double y_center) {
        this.radius = radius;
        x = x_center;
        y = y_center;
        
    }
    
    public double[] randPoint() {
    	
    	double randX = rng.nextDouble()*(radius*2) - radius;
    	double bound = Math.sqrt(Math.pow(radius, 2)-Math.pow(x, 2));
    	double randY = rng.nextDouble()*(bound*2) - bound;
    	
    	return new double[] {randX+x,randY+y};
    	
        
    }

}
