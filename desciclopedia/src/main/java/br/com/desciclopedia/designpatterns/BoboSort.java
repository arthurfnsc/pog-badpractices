package br.com.desciclopedia.designpatterns;

import java.util.Random;

public class BoboSort {

	static int[] vet = { 5, 2, 9, 1, 4, 7, 6, 8, 0, 3 };

	static void KickSort(int[] v) {

		while (true) {
			System.out.println("");
			for (int i = 0; i < vet.length; i++) {
				System.out.print(" - " + vet[i]);
			}
			int aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, aux9, aux10;
			if (v[0] < v[1]) {
				if (v[1] < v[2]) {
					if (v[2] < v[3]) {
						if (v[3] < v[4]) {
							if (v[4] < v[5]) {
								if (v[5] < v[6]) {
									if (v[6] < v[7]) {
										if (v[7] < v[8]) {
											if (v[8] < v[9]) {
												return;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			Random rdm = new Random();
			int x0 = 0;
			int x1 = 0;
			int x2 = 0;
			int x3 = 0;
			int x4 = 0;
			int x5 = 0;
			int x6 = 0;
			int x7 = 0;
			int x8 = 0;
			int x9 = 0;
			// Abaixo código para otimzar a ordenação. tecnica usado por
			// MPOGGERS.
			while (x0 == x1 || x0 == x2 || x0 == x3 || x0 == x4 || x0 == x5 || x0 == x6 || x0 == x7 || x0 == x8
					|| x0 == x9 || x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5 || x1 == x6 || x1 == x7 || x1 == x8
					|| x1 == x9 || x2 == x3 || x2 == x4 || x2 == x5 || x2 == x6 || x2 == x7 || x2 == x8 || x2 == x9
					|| x3 == x4 || x3 == x5 || x3 == x6 || x3 == x7 || x3 == x8 || x3 == x9 || x4 == x5 || x4 == x6
					|| x4 == x7 || x4 == x8 || x4 == x9 || x5 == x6 || x5 == x7 || x5 == x8 || x5 == x9 || x6 == x7
					|| x6 == x8 || x6 == x9 || x7 == x8 || x7 == x9 || x8 == x9) {
				x0 = rdm.nextInt(10);
				x1 = rdm.nextInt(10);
				x2 = rdm.nextInt(10);
				x3 = rdm.nextInt(10);
				x4 = rdm.nextInt(10);
				x5 = rdm.nextInt(10);
				x6 = rdm.nextInt(10);
				x7 = rdm.nextInt(10);
				x8 = rdm.nextInt(10);
				x9 = rdm.nextInt(10);

			}

			aux1 = v[x0];
			aux2 = v[x1];
			aux3 = v[x2];
			aux4 = v[x3];
			aux5 = v[x4];
			aux6 = v[x5];
			aux7 = v[x6];
			aux8 = v[x7];
			aux9 = v[x8];
			aux10 = v[x9];
			v[0] = aux1;
			v[1] = aux2;
			v[2] = aux3;
			v[3] = aux4;
			v[4] = aux5;
			v[5] = aux6;
			v[6] = aux7;
			v[7] = aux8;
			v[8] = aux9;
			v[9] = aux10;

		}
	}

	public static void main(String args[]) {
		KickSort(vet);
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

}
