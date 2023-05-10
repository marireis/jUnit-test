import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RetanguloTest {
	
	//teste instanciando um conjunto de valores
	private int base;
	private int altura;
	private int area;

	Retangulo retangulo;
	
	@Parameters//conjunto de entrada para teste
	public static Collection<Object[]>parametros(){//metodo estatico que retorna um collection
		return Arrays.asList(new Object[][] {
			{10,20,200},//base , altura, area
			{10,30,300}
		});
	}
	
	public RetanguloTest(int base, int altura, int area) {//construtor da classe de test
		this.base = base;
		this.altura = altura;
		this.area = area;
	}
	
	@Test
	public void testCalculoArea() {
		Retangulo retangulo = new Retangulo(base, altura);
		int result = retangulo.calcularArea();
		assertEquals(area, result);
	}
	
	
	//teste instanciando os valores
//	@Test
//	public boolean testCalcularArea() {
//		retangulo = new Retangulo(10, 2);
//		
//		int resultadoEsperado = 20;
//		
//		int resultado = retangulo.calcularArea();
//		
//		if(resultado == resultadoEsperado) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	@Test
//	public boolean testCalculoPerimetro() {
//		retangulo = new Retangulo(10, 2);
//		
//		int resultadoEsperado = 24;
//		
//		int resultado = retangulo.calcularPerimentro();
//		
//		if(resultado == resultadoEsperado) {
//			return true;
//		}else {
//			return false;
//		}
//	}

}
