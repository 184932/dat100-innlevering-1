package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	public static void main(String[] args) {
		
		int n;
		do {
			String heltall = showInputDialog("Heltall (Over 0) :");
			n = parseInt(heltall);
		}
		while (n<0);
		
		int sum = 1;
		int x1 = 1;
		
		while (n > x1 ) {
			x1 = x1 + 1;
			sum = sum * x1;
		}
		System.out.println("n = " + n + " gir n! = " + sum);
	}

}
