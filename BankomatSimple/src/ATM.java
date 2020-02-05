
public class ATM {

	protected double ukupnoPara;

	public ATM() {
		this.ukupnoPara = 100000;
	}

	public double getUkupnoPara() {
		return ukupnoPara;
	}

	protected void opcije() {
		System.out.println("Opcija 1 - Provera stanja na racunu");
		System.out.println("Opcija 2 - Podizanje novca");
		System.out.println("Opcija 3 - Promena PIN-a");
		System.out.println("Opcija 4 - Izlaz");
	}

}
