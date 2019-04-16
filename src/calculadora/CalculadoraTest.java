package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(2,3);
		int esperado = 5; // 2 + 3 = 5
		assertEquals(resultado,esperado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(5,2);
		int esperado = 3; // 5 + 2 = 3
		assertEquals(resultado,esperado);
	}

}
