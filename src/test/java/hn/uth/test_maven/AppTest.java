package hn.uth.test_maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	
private static Random rd;
	
	@BeforeClass
	public static void inicializacion() {
		System.out.println("Ejecutando prueba unitaria");
		rd = new Random();
	}

	
	@Test
	public void areaConAleatorio() {
		//NEXT DOUBLE GENERA UN NÚMERO ALEATORIO DECIMAL
		double numero1 = generarAleatorio();
		double resultadoEsperado = Math.PI*numero1*numero1;		
		assertEquals(App.areaCirculo(numero1), resultadoEsperado, 0.01);		
		System.out.print("Numero1= "+numero1);
		System.out.println(" Resultado= "+resultadoEsperado);
	}
	
	@Test
	public void areaConNegativo() {
		//NEXT DOUBLE GENERA UN NÚMERO ALEATORIO DECIMAL
		assertTrue(App.areaCirculo(-5)==-1);	
	}
	
	@Test
	public void areaConPositivo() {
		//NEXT DOUBLE GENERA UN NÚMERO ALEATORIO DECIMAL
		assertFalse(App.areaCirculo(5)==-1);	
	}
	
	
	
	
	
   
	
	@AfterClass
	public static void finalizacion() {
		System.out.println("Prueba unitaria finalizada");
	}
	
	//METODO AUXILIAR, NO TIENE ANOTACIÓN
		private double generarAleatorio() {
			return rd.nextDouble();
		}
}
