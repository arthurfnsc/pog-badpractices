package br.com.desciclopedia.designpatterns;

public class ExceptionSuccess {

	public static void somar(int a, int b) {
		System.out.println(a + b);
		throw new RuntimeException("Operação realizada com sucesso!");
	}
}
