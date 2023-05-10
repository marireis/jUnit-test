
public class PilhaMain {

	public static void main(String[] args) {
		
		PilhaTest test = new PilhaTest();
		
		boolean result;

		result = test.testRetiraUltimoLivro();
		System.out.println("RetiraUltimoLivro: " + result);
		
		result = test.testNaoAdicionaLivroAlemLimite();
		System.out.println("testNaoAdicionaLivroAlemLimite: " + result);
		
		
		result = test.testNaoAdicionaLivroForaPadraoNome();
		System.out.println("NaoAdicionaLivroForaPadraoNome: " + result);
	}
}
