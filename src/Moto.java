
public class Moto extends VeicoloMotore {
	private int tMotore; // Why String?

	public Moto(String marca, int anno, int cilindrata, int tMotore) {
		super.setMarca(marca);
		super.setAnno(anno);
		super.setCilindrata(cilindrata);
		this.tMotore = tMotore;
	}

	@Override
	public String toString() {
		return "Moto -- " + super.getMarca() + "   " + super.getAnno() + "   " + super.getCilindrata() + "cc   "
				+ tMotore + " tempi";
	}

}
