package br.com.desciclopedia.designpatterns;

public class ReverseBlackCatInADarkRoom {

	public static Object[] process() {
		Object[] darkRoom = new Object[100];

		darkRoom[3] = getCost();
		darkRoom[7] = getDescription() + " (" + getQuantity() + ")";

		darkRoom[0] = null; // don't remove this
		darkRoom[16] = "#";

		return darkRoom;
	}

	private static String getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object getCost() {
		// TODO Auto-generated method stub
		return null;
	}
}
