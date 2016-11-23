package br.com.desciclopedia.designpatterns;

public class ExceptionToBoolean {

	public boolean isResultadoDivisaoMaiorCinco(int a, int b) {
		try {
			// ok, lembrei que uma divisão por zero vai falhar
			return (a / b) > 5;
		} catch (Exception e) {
			// mas como o sistema é fodástico ele nunca vai tentar dividir por
			// zero
			// pq isso é coisa de gente fraca
			return false;
		}
	}
}
