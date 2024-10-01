package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for (int rad[] : matrise) {
			for (int element : rad) {
			System.out.print(element + " ");	
			}
			System.out.println();
		}	
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		if (matrise == null || matrise.length == 0) {
	        return "";
	    }
	    StringBuilder sb = new StringBuilder(); 
	    for (int i = 0; i < matrise.length; i++) {  
	        for (int j = 0; j < matrise[i].length; j++) {  
	            sb.append(matrise[i][j]);  
	            if (j < matrise[i].length - 1) {
	                sb.append(" "); 
	            }
	        }
	            sb.append(" \n");  
	    }

	    return sb.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int[][] matrise1 = new int [matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {  
	        for (int j = 0; j < matrise[i].length; j++) {  
	            matrise1[i][j] = matrise[i][j] * tall;
	            
	        }
		}
		return matrise1;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
	        for (int j = 0; j < a[i].length; j++) {
	        	if ( a[i][j] != b [i][j]) {
	        		return false;
	        	}
	        }
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
