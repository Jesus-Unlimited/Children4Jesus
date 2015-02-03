
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    //New object of MonteCarloMath class
   public MonteCarloMath mcObj = new MonteCarloMath(3.0,5.0,2.0);
    /**
     * Constructor for objects of class Tester
     */
    public Tester()
    {
        int cirCount=0;
        int sqrCount=0;
        int i;
      for(i=0; i<=100; i++){
          double x = mcObj.nextRainDrop_x();
          double y = mcObj.nextRainDrop_y();
          boolean test = mcObj.insideCircle(x,y);
          if(test==true){
              cirCount++;
            }
            sqrCount++;
        }
        System.out.println((cirCount/sqrCount)*4);
    }

}
