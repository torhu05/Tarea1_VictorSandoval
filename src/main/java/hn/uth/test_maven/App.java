package hn.uth.test_maven;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args ){
        System.out.println( "Tarea 1 Primer Parcial Victor Sandoval" );
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio del cirulo");
        double radio = scan.nextDouble();
        System.out.println("Ingrese el lado del cuadrado");
        double ladoCuadrado = scan.nextDouble();
        System.out.println("Ingrese el lado 1 del Rectangulo");
        double lado1Rectangulo = scan.nextDouble();
        System.out.println("Ingrese el lado 2 del Rectangulo");
        double lado2Rectangulo = scan.nextDouble();
        System.out.println("Ingrese el lado 1 del Triangulo");
        double lado1Triangulo = scan.nextDouble();
        System.out.println("Ingrese el lado 2 del Triangulo");
        double lado2Triangulo = scan.nextDouble();
        
        double areaCirculo, areaCuadrado, areaRectangulo, areaTriangulo;
        areaCirculo = areaCirculo(radio);
        areaCuadrado = areaCuadrado(ladoCuadrado);
        areaRectangulo = areaRectangulo(lado1Rectangulo,lado2Rectangulo);
        areaTriangulo = areaTriangulo(lado1Triangulo, lado2Triangulo);
        
        if(areaCirculo == -1) {
            System.out.println("Area del circulo no definida"); 
            }else
            	System.out.println("El area del circulo es: " + areaCirculo);
        if(areaCuadrado == -1) {
            System.out.println("Area del Cuadrado no definida"); 
            }else
            	System.out.println("El area del Cuadrado es: " + areaCuadrado);
        if(areaRectangulo == -1) {
            System.out.println("Area del Rectangulo no definida"); 
            }else
            	System.out.println("El area del Rectangulo es: " + areaRectangulo);
        if(areaTriangulo == -1) {
            System.out.println("Area del Triangulo no definida"); 
            }else
            	System.out.println("El area del Triangulo es: " + areaTriangulo);
    }
	
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
	
	public static double areaTriangulo(double base, double altura) {
    	if(noNegativo(base)&&noNegativo(altura)) {
    		return base*altura/2;
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
