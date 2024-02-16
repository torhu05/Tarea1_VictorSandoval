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
	
	public static double areaCuadrado(double lado) {
    	if(noNegativo(lado)) {
    		return Math.pow(lado,2);
    	}
    	else
    		return -1;
    	
	}
	
	public static double areaRectangulo(double lado1, double lado2) {
    	if(noNegativo(lado1)&&noNegativo(lado2)) {
    		return lado1*lado2;
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
