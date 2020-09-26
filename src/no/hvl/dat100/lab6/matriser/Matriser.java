package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int y[]: matrise) {
            for (int x: y) {
                System.out.print(x);
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String output = "";

        for (int y[]: matrise) {
            for (int x: y) {
                output += (x + " ");

            }
            output += "\n";

        }
        System.out.println(output);
        return output;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int nymatrise [][] = new int [matrise.length][matrise[0].length];

        for ( int y = 0; y < matrise.length; y++) 
            for (int x = 0; x < matrise[y].length; x++) 
                nymatrise[y][x] = matrise [y][x]* tall;

        return nymatrise;
        
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true; 
        int rad1, rad2, kol1, kol2;

        rad1 = a.length;
        kol1 = a[0].length;

        rad2 = b.length;
        kol2 = b[0].length;

            if (rad1 != rad2 || kol1 != kol2) {
                lik = false;
            }
            else {
                for (int i = 0; i < rad1; i++) {
                    for (int j = 0; j < kol1; j++) {
                        if(a[i][j] != b[i][j]) {
                            lik = false;
                            break;
                        }
                    }
                }
                if (lik)
                    lik= true;
                else
                    lik = false;
            }
            // System.out.println(lik);
            // erLik(a,a); i main.
        return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int [][] speiletmatrise = new int [matrise.length][matrise[0].length] ; // lager tom speilet matrise som har samme størrelse som input matrise. 
        int x = 0;                                                              // representasjon av første elementet i hver rad. bare i begynnelsen. den blir større etter hvert
        for (int i = 0; i < matrise.length; i++) {                              // for loop som looper gjennom hver rad. 

            int y = 0;                                                             // y variabel som tilsvarer nedover rad "den vi er på". 
            while (y < matrise[i].length) {                                     // går inn i while loop og sjekker om vi er fortsatt i for grensene. 
                speiletmatrise[i][y] = matrise[y][x];                            // legger til alle første elementer fra hver rad. så øker du x og begynner lengre ned. 
                y++;
            }
            x++;
        } 
        return speiletmatrise;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int multiplisert [][] = new int [a.length][b[0].length];       // lager ny matrise, tom. har samme størrelse som a*b

        if (a[0].length == b.length) {                                 // sjekker om første linjen i matrise a er lik med column i matrise b. størrelse. 
            for (int i = 0; i < a.length; i++) {                         // looper gjennom alt som vanlig. 
                for (int j= 0; j< b[0].length; j++) {                  // vanlig looping av matrise. 
                    multiplisert[i][j] = 0;
                    for (int k = 0 ; k < a[0].length; k++) {
                        multiplisert [i] [j]  += a[i][k] * b [k] [j];  // multipliserer og legger til elementer som er multiplisert. 
                    }

                }
            }
        }
        return multiplisert;
	
	}
}
