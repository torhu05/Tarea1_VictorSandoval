package hn.uth.test_maven;


/**
 * Hello world!
 *
 */
public class App 
{
	public static double areaCirculo(double radio) {
    	if(noNegativo(radio)) {
    		return Math.pow(radio,2)*Math.PI;
    	}
    	else
    		return -1;
    	
	}
    
    
    public static boolean noNegativo(double radio) {
    	if(radio>=0)
    		return true;
    	else
    		return false;
    		
    	
    }
}
