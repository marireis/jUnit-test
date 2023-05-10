import org.junit.Test;

public class PilhaTest {

	Pilha pilha = new Pilha();
	
	@Test
	public boolean testRetiraUltimoLivro() {
		
		
		Livro livro = new Livro("A Fortaleza");
		pilha.push(livro);
		
		livro = new Livro("A Emboscada");
		pilha.push(livro);	
		
		livro = new Livro("O Naufrago");
		pilha.push(livro);
		
		String resultEsperado = "O Naufrago";
		return pilha.pop().getTitulo().equals(resultEsperado);
	}
	
	@Test
	public boolean testNaoAdicionaLivroAlemLimite() {
		Pilha pilha = new Pilha();
		
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Fortaleza");
		Livro livro3 = new Livro("A Cerra");
		Livro livro4 = new Livro("O Mar");
		Livro livro5 = new Livro("O Sol");
		Livro livro6 = new Livro("A Lua");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);
		
		String resultEsperado = "O Sol";
		
		return pilha.pop().getTitulo().equals(resultEsperado);
	}
	
	@Test
	public boolean testNaoAdicionaLivroForaPadraoNome() {
		Pilha pilha = new Pilha();
		
		Livro livro  = new Livro("A Fortaleza");
		pilha.push(livro);
		
		Livro livro2  = new Livro("O Fortaleza");
		pilha.push(livro2);
		
		String resultEsperado = "A Fortaleza";
		
		return pilha.pop().getTitulo().equals(resultEsperado);

	}
}
