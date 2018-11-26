import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		String m = "";
		Garage g = new Garage();
		while (!m.equals("3")) {

			System.out.println(
					"\nMENU DEL GARAGE:\n\nInserire:\n0)Per immettere un veicolo nel garage\n1)Per rimuovere un veicolo dal garage\n2)Per visualizzare il garage\n3)Per uscire dal programma");
			m = sc.nextLine();

			switch (m) {
			case "0":
				System.out.println(
						"\n0)Per immettere un'automobile\n1)Per immettere un furgone\n2)Per immettere una moto");

				String scelta = sc.nextLine();

				if (scelta.equals("0")) {
					g.entraV(createAuto());
					System.out.println("Auto inserita correttamente");
				} else if (scelta.equals("1")) {
					g.entraV(createFurgone());
					System.out.println("Furgone inserito correttamente");
				} else if (scelta.equals("2")) {
					g.entraV(createMoto());
					System.out.println("Moto inserita correttamente");
				} else {
					System.out.println("Numero non riconosciuto.");
				}
				break;

			case "1":
				g.esceV();
				System.out.println("Veicolo rimosso correttamente");
				break;

			case "2":
				g.stampaG();
				break;

			case "3":
				System.out.println("Uscita dal programma in corso..");
				break;

			default:
				System.out.println("Opzione non riconosciuta. Riprovare.");
				break;
			}
		}
	}

	public static VeicoloMotore createAuto() {

		String marca = "";
		int anno = 0;
		int cilindrata = 0;
		int nPorte = 0;
		boolean scelta = true;
		String alimentazione = "";

		System.out.println("Inserire marca: ");
		marca = sc.nextLine();
		Exception error = null;
		do {
			try {
				error = null;
				System.out.println("Inserire anno: ");
				anno = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Riprovare");
			}
		} while (error != null);
		do {
			try {
				error = null;
				System.out.println("Inserire cilindrata: ");
				cilindrata = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Non so che cosa tu abbia fatto, ma non va bene, riprova.");
			}
		} while (error != null);
		System.out.println("Inserire numero delle porte: ");
		nPorte = sc.nextInt();
		while (scelta) {
			System.out.println("Scegliere alimentazione:\n0)Benzina\n1)Diesel");
			alimentazione = sc.nextLine();
			if (alimentazione.equals("0")) {
				Auto auto = new Auto(marca, anno, cilindrata, nPorte, Auto.Alimentazione.Benzina);
				scelta = false;
				return auto;
			} else if (alimentazione.equals("1")) {
				Auto auto = new Auto(marca, anno, cilindrata, nPorte, Auto.Alimentazione.Diesel);
				scelta = false;
				return auto;
			} else {
				System.out.println("Numero errato, riprovare.");
			}
		}
		return null;

	}


	public static VeicoloMotore createFurgone() {
		String marca = "";
		int anno = 0;
		int cilindrata = 0;
		int kg = 0;

		System.out.println("Inserire marca: ");
		marca = sc.nextLine();
		Exception error = null;
		do {
			try {
				error = null;
				System.out.println("Inserire anno: ");
				anno = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Non so che cosa tu abbia fatto, ma non va bene, riprova.");
			}
		} while (error != null);
		do {
			try {
				error = null;
				System.out.println("Inserire cilindrata: ");
				cilindrata = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Non so che cosa tu abbia fatto, ma non va bene, riprova.");
			}
		} while (error != null);
		do {
			try {
				error = null;
				System.out.println("Inserire la capacità del furgone in kilogrammi");
				kg = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Non so che cosa tu abbia fatto, ma non va bene, riprova.");
			}
		} while (error != null);


		Furgone furgone = new Furgone(marca, anno, cilindrata, kg);
		return furgone;
	}

	public static VeicoloMotore createMoto() {
		String marca = "";
		int anno = 0;
		int cilindrata = 0;
		int tMotore = 2;

		System.out.println("Inserire marca: ");
		marca = sc.nextLine();

		Exception error = null;
		do {
			try {
				error = null;
				System.out.println("Inserire anno: ");
				anno = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Non so che cosa tu abbia fatto, ma non va bene, riprova.");
			}
		} while (error != null);
		do {
			error = null;
			try {
				System.out.println("Inserire cilindrata: ");
				cilindrata = sc.nextInt();
			} catch (Exception e) {
				error = new Exception("Errore");
				System.out.println("Non so che cosa tu abbia fatto, ma non va bene, riprova.");
			}
		} while (error != null);

		do {
			System.out.println("Inserisci i tempi del motore (o 2 o 4): ");
			tMotore = sc.nextInt();
		} while (!(tMotore == 2) && !(tMotore == 4));

		Moto moto = new Moto(marca, anno, cilindrata, tMotore);
		return moto;
	}

}
