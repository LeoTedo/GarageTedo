
public class Furgone extends VeicoloMotore {

	private int cCarico;

	public Furgone(String marca, int anno, int cilindrata, int cCarico) {
		super.setMarca(marca);
		super.setAnno(anno);
		super.setCilindrata(cilindrata);
		this.cCarico = cCarico;
	}

	@Override
	public String toString() {
		return "Furgone -- " + super.getMarca() + "   " + super.getAnno() + "   " + super.getCilindrata() + "cc   "
				+ cCarico + "Kg";
	}

}
