
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PilhaTextFixture {

	static Pilha pilha = new Pilha();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		Livro livro1 = new Livro("O Joao e Maria");
		Livro livro2 = new Livro("O Joao");
		Livro livro3 = new Livro("A Maria");
		Livro livro4 = new Livro("A Montanha");
		Livro livro5 = new Livro("O Tiro");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		int tamanho = pilha.count();
		while(tamanho > 0) {
			pilha.pop();
			tamanho--;
		}
		
		System.out.println("After");
	}

//	@Test //com return em vez de exceção 
//	public void testNaoAdicionaAlemLimite() {
//		pilha.push(new Livro("A VOLTA"));
//		
//		Livro livro = pilha.pop();
//		assertEquals("O Tiro", livro.getTitulo());
//		
//		System.out.println("executou testNaoAdicionaAlemLimite");
//	}
	
	
	@Test
	public void testNaoAdicionaAlemLimiteComComTryCatch() {
		
		try {
			pilha.push(new Livro("A VOLTA"));
			fail();
		} catch(ArrayStoreException e) {
			assertTrue(true);
		}
		System.out.println("executou testNaoAdicionaAlemLimiteComTryCatch");
	}
	
	@Test(expected = ArrayStoreException.class)
	public void testNaoAdicionaAlemLimiteComComException() {
		
		pilha.push(new Livro("A VOLTA"));
	
		System.out.println("executou testNaoAdicionaAlemLimiteComException");
	}
	
	@Test
	public void adicionaLivroForaPadraoNome() {
		pilha.pop();
		
		pilha.push(new Livro("Não Vale"));
		
		Livro livro = pilha.pop();
		assertEquals("A Montanha", livro.getTitulo());
		
		System.out.println("adicionaLivroForaPadraoNome");
	}

}
