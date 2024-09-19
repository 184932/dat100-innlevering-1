package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {
	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			
			
			int p;
			do {
				String poeng = showInputDialog("Antall poeng 0-100 :");
				p = parseInt(poeng);
			}
			while ((p < 0) || (p > 100));
			
			
			if (p < 40) {
				System.out.println("Karakter: F");
			}
			if ((50 > p) && (p > 39)) {
				System.out.println("Karakter: E");
			}
			if ((60 > p) && (p > 49)) {
				System.out.println("Karakter: D");
			}
			if ((80 > p) && (p > 59)) {
				System.out.println("Karakter: C");
			}
			if ((90 > p) && (p > 79)) {
				System.out.println("Karakter: B");
			}
			if ((100 >= p) && (p > 89)) {
				System.out.println("Karakter: A");
			}
			else if ((p < 0) || (p > 100)) {
				System.out.println("Ugyldig verdi");
			}
		}
	}
	
}