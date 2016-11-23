package br.com.desciclopedia.designpatterns;

public class BulletProof {

	public static void process(Object[] stuff) {
		try {
			doSomething(stuff[0]);
		} catch (Throwable t) {
		}
		try {
			doSomethingElse(stuff[1], stuff[7]);
		} catch (Throwable t) {
		}
		try {
			verify(stuff[3]);
		} catch (Throwable t) {
		}
	}

	private static void verify(Object object) {
		// TODO Auto-generated method stub
		
	}

	private static void doSomethingElse(Object object, Object object2) {
		// TODO Auto-generated method stub
		
	}

	private static void doSomething(Object object) {
		// TODO Auto-generated method stub
		
	}
}
