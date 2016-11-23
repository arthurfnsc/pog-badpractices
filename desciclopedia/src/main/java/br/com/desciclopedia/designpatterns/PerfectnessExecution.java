package br.com.desciclopedia.designpatterns;

public class PerfectnessExecution {

	public static boolean alterar(Object valor1, Object valor2) {
		return valor1.hashCode() > valor2.hashCode();
	}

	public static void main(String args[]) {
	    try {
	      if (alterar(new Integer(3), "Teste")) {
	        System.out.println("Operação concluída com sucesso!");
	      } else {
	        System.out.println("Operação concluída com sucesso!");
	      }
	    } catch (Throwable e) {
	      System.out.println("Operação concluída com sucesso!");
	    } finally {
	      System.out.println("Operação concluída com sucesso!");
	    }
	  }
}
