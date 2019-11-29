package Examen;

import junit.framework.Calculadora;
import junit.framework.TestCase;


public class Main extends TestCase {
	
	private Calculadora calculadora;
      
	public void inicio () {
		calculadora = new Calculadora();
	}
	
		
		public void testsuma () {
			
			int suma = Calculadora.sumar(2,3);
			int resultado =5;
			assertEquals(resultado, suma);
			
		}
public void resta () {
			
			int resta = Calculadora.restar(8,4);
			int resultado =4;
			assertEquals(resultado, resta);
			
		}
public void multiplicacion () {
	
	int multiplicacion = Calculadora.multiplicar(2,4);
	int resultado =8;
	assertEquals(resultado, multiplicacion);
	
}
public void division () {
	
	int division = Calculadora.dividir(6,3);
	int resultado =2;
	assertEquals(resultado, division);
	
	
}

public void exponente () {
	
	int exponente = Calculadora.Exponeniacion(Calculadora.sumar(2,3),Calculadora.multiplicar(1,5));
	int resultado =125;
	assertEquals(resultado, exponente);
	
	
}
		
		

	

}
