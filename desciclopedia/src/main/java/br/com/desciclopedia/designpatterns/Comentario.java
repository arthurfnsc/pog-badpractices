package br.com.desciclopedia.designpatterns;

public class Comentario {

	/**
	 * Método para somar o valor de A com o valor de B.<br>
	 * Exemplo de uso deste método:<br>
	 * <pre>
	 *   int a = 5;
	 *   int b = 3;
	 *   int soma = somaAB(a, b);
	 * </pre>
	 * No exemplo supracitado, a variável <code>soma</code> conterá
	 * o valor da soma das variáveis <code>a</code> e <code>b</code>.
	 * Tendo em vista que o valor da variável <code>a</code> é 5 e o da variável <code>b</code> é 3,
	 * será atribuido à variável <code>soma</code> o valor 8.
	 *
	 * @param [in] a O valor de A, a ser somado com o valor de B.
	 * @param [in] b O valor de B, a ser somado com o valor de A.
	 * @return O valor resultante da soma dos valores dos parâmetros A e B.
	 * @see subtracaoAB(int, int)
	 * @see multiplicaoAB(int, int)
	 * @see divisaoAB(int, int)
	 */
	public static int somaAB(int a, int b)
	{ /* Início da declaração do método somaAB. */
	    return a + b; // Aqui é retornado a soma de a com b.
	} /* Fim da declaração do método somaAB. */

	/**
	 * Variável que informa se aplicativo está aberto ou não.
	 * Caso o valor contido nesta variável seja <code>true</code>,
	 * então o aplicativo está aberto.
	 * Caso o valor contido nesta variável seja <code>false</code>,
	 * então o aplicativo não está aberto.
	 */
	public static boolean isAplicativoAberto = false;

	/**
	 * Campo que guarda a senha secreta para executar esta aplicação.
	 * @see verificaSenha(String)
	 */
	public static String senhaSecreta = "123456";

	/**
	 * Método que verifica se a senha informada para a execução do aplicativo está
	 * correta.<br>
	 * Exemplo de uso deste método:<br>
	 * <pre>
	 *   if (verificaSenha(senha))
	 *   { // Início do bloco de execução da estrutura condicional de decisão if.
	 *      ... // Bloco de instruções a ser executado caso a senha esteja correta.
	 *   } // Fim da estrutura condicional de decisão if.
	 * </pre>
	 *
	 * @param [in] senha A senha a ser verificada com a senha secreta.
	 * @return <code>true</code> caso a senha informada no parâmetro coincida
	 * com a senha secreta, <code>false</code> caso a senha informada no parâmetro
	 * não coincida com a senha secreta.
	 * @see senhaSecreta
	 */
	public static boolean verificaSenha(String senha)
	{ /* Início da declaração do método verificaSenha. */

	    // Se a senha informada coincidir com a senha da aplicação,
	    // retorna verdadeiro, pois isso significa que a senha está correta.
	    if (senha.equals(senhaSecreta)) // Aqui tem que usar o equals porque o == dá pau.
	    { /* Início do bloco de execução da estrutura condicional de decisão if. */
	        return true; // Aqui o valor true é retornado.
	    } /* Fim da estrutura condicional de decisão if. */

	    // Se o valor true não foi retornado acima, é porque a senha está incorreta,
	    // então o valor false deve ser retornado.
	    return false; // Retorna o valor false.

	} /* Fim da declaração do método verificaSenha. */
}
