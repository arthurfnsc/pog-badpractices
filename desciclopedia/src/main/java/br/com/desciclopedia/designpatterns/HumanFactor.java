package br.com.desciclopedia.designpatterns;

public class HumanFactor implements Runnable {

	public void run() {
		while (true) {
			doSomething();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// nevermind
			}

			doSomethingElse();
		}
	}

	private void doSomethingElse() {
		// TODO Auto-generated method stub

	}

	private void doSomething() {
		// TODO Auto-generated method stub

	}
}
