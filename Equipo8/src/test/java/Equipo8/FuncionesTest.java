package Equipo8;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionesTest {

	private Funciones funciones = new Funciones();
	private int resultado;
	private int resultadoEsperado;
	@Test
	public void testCuadrado() {
		resultadoEsperado = 9;
		resultado = funciones.cuadrado(3);
		assertEquals(resultadoEsperado, resultado);
	}

}
