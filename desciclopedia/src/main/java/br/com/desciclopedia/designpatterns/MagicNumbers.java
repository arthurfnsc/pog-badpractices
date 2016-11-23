package br.com.desciclopedia.designpatterns;

import br.com.desciclopedia.model.H;

public class MagicNumbers {

	H h;

	double d = 62;

	public int[] retornar(int x, int y, int a, double totalDeElementos, int c, int m) {

		if (x + y > 17) {
			a = 4;
		} else {
			a = 9;
		}

		if (totalDeElementos > 1200.0)
			h.x += 19;

		int valores[] = { -6, 12, 15, 16 - c, 3, 0, 9, a + h.x * 5, -1, 0, 4 * m, 28, 7 - (int) (d / 2.38), 31,
				15 + (int) (h.cotas.elementos[17] * 3.227), 18 };
		
		return valores;
	}
}
