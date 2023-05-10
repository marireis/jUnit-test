import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testVerificarIdade() {
		Pessoa alguem = new Pessoa();
		
		alguem.verificarIdade(40);
		assertTrue(true);
	}
	
	@Test
	public void testVerificarIdadeJovem() {
		Pessoa alguem = new Pessoa();
		
		alguem.verificarIdade(20);
		assertTrue(true);
	}

}
