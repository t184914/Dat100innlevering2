package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		if (tabell == null || tabell.length == 0) {
            return "[]"; 
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");  
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);  
            if (i < tabell.length - 1) {
                sb.append(","); 
            }
        }
        sb.append("]"); 

        return sb.toString(); 
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			
			sum = tabell[i] + sum;
			
		}
		return sum; 
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		boolean test = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				test = true;
			}
		}
		return test;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		for (int i = 0; i  < tabell.length; i ++) {
			if (tabell[i] == tall) {
				return i;
				
				}
			}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[]  revers = new int[tabell.length]; 
		for (int i = 0; i  < tabell.length; i ++) {
			revers[i] = tabell[tabell.length -1 -i];
			
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int i = 0; i < tabell.length - 1; i++ ) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}	
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int[]  sammen = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sammen[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			sammen[tabell1.length + i] = tabell2[i];
		}
		return sammen;
		
	}
}
