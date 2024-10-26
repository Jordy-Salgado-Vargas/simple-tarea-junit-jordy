package hn.js.jv.simple_tarea_junit_jordy;

import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
 
{
	private static App Areas;
	
	@BeforeClass
	public static void setUpClass(){
		
		Areas = new App();
	
	}
	
	//AREA DE CIRCULO.
	@Test 
	public void pruebaAreaCi_1()	
	{
		Double radio = 3.5;
		Double resp = 3.14 * radio * radio;
		Double resultado = Areas.areaCi(radio);
		assertEquals( Math.round(resp*100.0)/100.0, resultado, 0.001);	
	}
	
	@Test
	public void pruebaAreaCi_2()	
	{
		Double radio = 3.0;
		Double resp = 3.14 * radio * radio;
		Double resultado = Areas.areaCi(radio);
		assertTrue( Math.round(resp*100.0)/100.0 == resultado);	
	}
	
	@Test
	public void pruebaAreaCi_3()	
	{
		Double radio = 0.0;
		Double resp = 3.14 * radio * radio;
		Double resultado = Areas.areaCi(radio);
		assertTrue( Math.round(resp*100.0)/100.0 == resultado);	
	}
	
	
	//AREA DE UN CUADRADO.
	
	@Test 
	public void pruebaAreaCu_1()	
	{
		double lado = 10;
	    Double resp = lado * lado;
        Double resultado = Areas.areaCu(lado);
        assertTrue( Math.round(resp*100.0)/100.0 == resultado);	
	}
	
	@Test 
	public void pruebaAreaCu_2()	
	{
		double lado = -7;
	    Double resp = lado * lado;
        Double resultado = Areas.areaCu(lado);
        assertTrue( Math.round(resp*100.0)/100.0 == resultado);	
	}
	
	@Test 
	public void pruebaAreaCu_3()	
	{
		Double lado = -7.656;
	    Double resp = lado * lado;
		Double resultado = Areas.areaCu(-7.656);
		assertEquals( Math.round(resp*100.0)/100.0, resultado, 0.001);	
	}
	

	//AREA RECTANGULO
	
	@Test 
	public void prubeaAreaRect_1()	
	{
		double base = 3;
		double altura = -9;
		Double resultado = Areas.areaRect(base,altura);
		assertNull(resultado);
	}
	
	@Test
	public void pruebaAreaRect_2()	
	{
		double base = 3;
		double altura = 0;
		Double resp = base * altura;
		Double resultado = Areas.areaRect(base,altura);
		assertEquals(Math.round(resp*100.0)/100.0, resultado, 0.001);
	}
	
	@Test 
	public void pruebaAreaRect_3() { 
	    double base = 5.5;
	    double altura = 2.3;
	    Double resp = base * altura;
	    Double resultado = Areas.areaRect(base, altura);
	    assertEquals(Math.round(resp * 100.0) / 100.0, resultado, 0.001);
	}

	
	//AREA TRIANGULO.
	@Test
	public void pruebaAreaTri_1() {
	    double base = 6.0;
	    double altura = 3.5;
	    Double resp = (base * altura) / 2;
	    Double resultado = Areas.areaTri(base, altura);
	    assertEquals(Math.round(resp * 100.0) / 100.0, resultado, 0.001);
	}

	@Test
	public void pruebaAreaTri_2() {
	    double base = -5.0;
	    double altura = 4.0;
	    assertThrows(IllegalArgumentException.class, () -> Areas.areaTri(base, altura));
	}


	@Test
	public void pruebaAreaTri_3() {
	    double base = 0;
	    double altura = 8.5;
	    Double resp = (base * altura) / 2;
	    Double resultado = Areas.areaTri(base, altura);
	    assertEquals(Math.round(resp * 100.0) / 100.0, resultado, 0.001);
	}

	
}
