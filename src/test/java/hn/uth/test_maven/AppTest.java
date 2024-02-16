package hn.uth.test_maven;

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

	
	
	
	@AfterClass
	public static void finalizacion() {
		System.out.println("Prueba unitaria finalizada");
	}
	
}
