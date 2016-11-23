package br.com.desciclopedia.designpatterns;

class 無 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

public class OperaçãoDeDivisão {
    
	int façaDivisão(int x, int y) throws 無 {
        if (y == 0) {
             throw new 無();
        }


        return x / y;
    }
}

