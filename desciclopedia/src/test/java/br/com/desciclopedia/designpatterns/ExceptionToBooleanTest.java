package br.com.desciclopedia.designpatterns;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ExceptionToBooleanTest {

	@Test
	public void divisaoMaiorQue5() {

		ExceptionToBoolean exceptionToBoolean = new ExceptionToBoolean();

		assertTrue(exceptionToBoolean.isResultadoDivisaoMaiorCinco(30, 4));
	}

	@Test
	public void divisaoMenorQue5() {

		ExceptionToBoolean exceptionToBoolean = new ExceptionToBoolean();

		assertFalse(exceptionToBoolean.isResultadoDivisaoMaiorCinco(20, 10));
	}

	@Test
	public void divisaoPorZero() {

		ExceptionToBoolean exceptionToBoolean = new ExceptionToBoolean();

		assertFalse(exceptionToBoolean.isResultadoDivisaoMaiorCinco(20, 0));
	}
}
