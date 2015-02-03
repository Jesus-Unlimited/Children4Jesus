import java.util.Random;
import java.lang.Math;
/**
 * Write a description of class MonteCarloMath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonteCarloMath
{
    // instance variables - replace the example below with your own
    
    private Random rndm = new Random();

   
    /**
     * Constructor for objects of class MonteCarloMath
     */
    public MonteCarloMath(Double k, Double h, Double r)
    {
        this.k=k;
        this.h=h;
        this.r=r;
    }
    //Creates x coordinate for raindrop
    public double nextRainDrop_x(){
        double x;
        x = rndm.nextDouble()*h;
        return x;
      }
      //Creates y coordinate for rain drop
    public double nextRainDrop_y(){
        double y;
        y = rndm.nextDouble()*k;
        return y;
    }
    // checks if coordinate of raindrop is inside the circle 
    public boolean insideCircle(double x, double y){
        Double test = Math.pow((x-k),2) + Math.pow((y-k),2);
        if(test<=Math.pow(r,2)){
            return true;
        }
        else{
            return false;
        }
         
        }
      
     public Double h;
     public Double k;
     public Double r;
}