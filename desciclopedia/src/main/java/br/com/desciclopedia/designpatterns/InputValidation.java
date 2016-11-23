package br.com.desciclopedia.designpatterns;

public class InputValidation {

	public static void main(String[] args) {

		if (1 == 2) {
			System.out.print("O seu processador está com problemas, compre outro ou contate o suporte");
			System.out.close();
		}
	}
}
