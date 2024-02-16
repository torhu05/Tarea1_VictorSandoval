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
	public void areaCirculoConAleatorio() {
		double numero1 = Math.abs(generarAleatorio());
		double resultadoEsperado = Math.PI*numero1*numero1;		
		assertEquals(App.areaCirculo(numero1), resultadoEsperado, 0.01);		
		System.out.print("Numero1= "+numero1);
		System.out.println(" Resultado= "+resultadoEsperado);
	}
	
	@Test
	public void areaCirculoConNegativo() {
		assertTrue(App.areaCirculo(-5)==-1);	
	}
	
	@Test
	public void areaCirculoConPositivo() {
		assertFalse(App.areaCirculo(5)==-1);	
	}
	
	@Test
	public void areaCuadradoConAleatorio() {
		double numero1 = Math.abs(generarAleatorio());
		double resultadoEsperado = numero1*numero1;		
		assertEquals(App.areaCuadrado(numero1), resultadoEsperado, 0.01);		
		System.out.print("Numero1= "+numero1);
		System.out.println(" Resultado= "+resultadoEsperado);
	}
	
	@Test
	public void areaCuadradoConNegativo() {
		assertTrue(App.areaCuadrado(-10)==-1);	
	}
	
	@Test
	public void areaCuadradoConPositivo() {
		assertFalse(App.areaCuadrado(20)==-1);	
	}
	
	
	
	@Test
	public void areaRectanguloConAleatorio() {
		double numero1 = Math.abs(generarAleatorio());
		double numero2 = Math.abs(generarAleatorio());
		double resultadoEsperado = numero1*numero2;		
		assertEquals(App.areaRectangulo(numero1,numero2), resultadoEsperado, 0.01);		
		System.out.print("Numero1= "+numero1);		
		System.out.print("Numero1= "+numero2);
		System.out.println(" Resultado= "+resultadoEsperado);
	}
	
	@Test
	public void areaRectanguloCon1Negativo() {
		assertTrue(App.areaRectangulo(-10,9)==-1);	
	}
	@Test
	public void areaRectanguloCon1bNegativo() {
		assertTrue(App.areaRectangulo(10,-9)==-1);	
	}
	@Test
	public void areaRectanguloCon2Negativo() {
		assertTrue(App.areaRectangulo(-10,-9)==-1);	
	}

	@Test
	public void areaRectanguloConPositivo() {
		assertFalse(App.areaRectangulo(20,4)==-1);	
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
