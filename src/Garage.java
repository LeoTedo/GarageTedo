import java.util.Arrays;
import java.util.Scanner;

public class Garage {
	private VeicoloMotore[] garage = new VeicoloMotore[15];

	public boolean entraV(VeicoloMotore v) {
		if (contaPosti() == garage.length - 1) {
			System.out.println("Nessun posto disponibile.");
			return false;
		}

		for (int i = 0; i < garage.length; i++) {
			if (garage[i] == null) {
				garage[i] = v;
				return true;
			}

			
		}

		return false;
	}

	public void esceV() {
		Scanner sc = new Scanner(System.in);
		stampaG();
		System.out.println("\nSeleziona il veicolo da rimuovere: ");
		int sel = sc.nextInt();
		garage[sel] = null;
	}

	public int contaPosti() {
		int conta = 0;
		for (int i = 0; i < garage.length; i++) {
			if (garage[i] != null) {
				conta++;
			}
		}
		return conta;
	}

	public void stampaG() {
		for (int i = 0; i < garage.length; i++) {
			if (garage[i] == null) {
				System.out.println(i + ") Libero");
			} else {
				System.out.println(i + ") " + garage[i]);
			}

		}
	}

	@Override
	public String toString() {
		return "Garage: " + Arrays.toString(garage) + "";
	}

}
