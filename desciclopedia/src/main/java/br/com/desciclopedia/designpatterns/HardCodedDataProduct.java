package br.com.desciclopedia.designpatterns;

import br.com.desciclopedia.model.Product;

public class HardCodedDataProduct {

	public void validar(Product product) {

		switch (product.getCodigo()) {
		case 32:
		case 60:
		case 67:
		case 73:
		case 90:
		case 115:
		case 131:
		case 147:
			// case 133: case 122: // A franciele falou que esses tem que ser
			// desativos.
			product.setTipo("Especial");
			break;
		case 21:
		case 44:
		case 45:
		case 46:
		case 78:
		case 92:
		case 101:
		case 122:
		case 144:
			product.setTipo("Promocional");
			break;
		case 12:
		case 15:
		case 39:
		case 56:
		case 65:
		case 79:
		case 81:
		case 82:
		case 84:
		case 109:
		case 127:
			// case 36: // Esse daqui é pra ativar só no dia 15.
			product.setTipo("Super");
			break;
		}
	}
}
