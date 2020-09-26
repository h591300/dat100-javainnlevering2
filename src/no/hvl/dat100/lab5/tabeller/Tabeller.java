package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int i = 0;
		while (i < tabell.length) {
			System.out.println(tabell[i]);
			++i;
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String ut = "";
		int i = 0;
		String svar = "";
		if (tabell.length == i) {
			svar = "[]";
		} else {
			while (i < tabell.length) {
				ut += tabell[i] + ",";
				++i;
			}

			svar = "[" + ut.substring(0, ut.length() - 1) + "]";
		}
		return svar;

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		int i = 0;
		/*
		 * for (i = 0; i < tabell.length;) { sum += tabell[i]; ++i; }
		 * 
		 * while (i < tabell.length) { sum += tabell[i]; ++i; }
		 */
		for (int t : tabell) {
			sum += t;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean r = false;
		for (int t : tabell) {
			if (t == tall) {
				r = true;
			}
		}
		return r;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for (int i = 0; i < tabell.length; ++i) {
			if (tabell[i] == tall) {
				pos = i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int l = tabell.length - 1;
		int[] nyTab = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[l];
			l--;
		}

		return nyTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++) { // -1 fordi i if har vi i+1.
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
				break;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int l = tabell1.length + tabell2.length;
		int[] sumTab = new int[l];
		for (int i = 0; i < tabell1.length; ++i) {
			sumTab[i] = tabell1[i];
		}
		for (int t = 0; t < tabell2.length; ++t) {
			sumTab[tabell1.length + t] = tabell2[t];
		}

		return sumTab;
	}
}
