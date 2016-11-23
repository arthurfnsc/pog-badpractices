package br.com.desciclopedia.designpatterns;

import java.math.BigDecimal;
import java.util.List;

import br.com.desciclopedia.model.Order;
import br.com.desciclopedia.model.Product;

public class BlackCatInADarkRoom1 {

	public static void process(Object[] darkRoom) {
		((Product) darkRoom[7]).setCost((BigDecimal) darkRoom[26]);
		((Product) darkRoom[7]).setPrice((BigDecimal) darkRoom[44]);
		((Product) darkRoom[7]).setFactor((Integer) darkRoom[30] / (Integer) darkRoom[40]);
		
		// O Marcão desativou essa linha e o bug da impressão de produtos arrumou,
		// mas a tela de funcionários ficou deslocada para a direita, ninguém sabe porque.
		//((Product) darkRoom[7]).setDescription(darkRoom[23] + ((String) darkRoom[3]));

		((Order) darkRoom[14]).addProduct((Product) darkRoom[7]);

		darkRoom[13] = darkRoom[21];
		((List) darkRoom[32]).remove(darkRoom[0]);

		darkRoom[27] = (String) darkRoom[5] + darkRoom[9];
	}
}
