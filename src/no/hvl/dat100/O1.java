package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O1 {
	public static void main(String[] args) {
		
		String bruttoinntekt = showInputDialog("Bruttoinntekt : ");
		int b = parseInt(bruttoinntekt);
		double skatt = 0;
		
		if (b>1350000) {
			skatt = ((b - 1350000) * 0.176);
			b = 1350000;
		}
		if (b>937900) {
			skatt = skatt + ((b - 937900) * 0.166);
			b = 937900;
		}
		if (b>670000) {
			skatt = skatt + ((b - 670000) * 0.136);
			b = 670000;
		}
		if (b>292850) {
			skatt = skatt + ((b - 292850) * 0.04);
			b = 292850;
		}
		if (b>208050) {
			skatt = skatt + ((b - 208050) * 0.017);
		}
		
		System.out.println("Du betaler " + skatt + "kr i trinnskatt.");

		}
		
	}

