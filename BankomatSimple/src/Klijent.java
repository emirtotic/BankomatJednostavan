import java.util.Scanner;

public class Klijent {

	private int pin;
	private double stanjeRacuna;
	private double iznos;

	Scanner scanner = new Scanner(System.in);

	public Klijent(double stanjeRacuna) {
		this.pin = 1234; // Default pin pri pokretanju programa koji je kasnije moguce izmeniti u aplikaciji
		this.stanjeRacuna = stanjeRacuna;
	}

	protected void unesiPin() {

		int tempPin;

		do {
			System.out.println("Unesite vas pin: ");
			tempPin = scanner.nextInt();

			if (tempPin == pin) {
				System.out.println("Prijava uspesna.");
			} else {
				System.out.println("Uneli ste pogresan pin. Pokusajte ponovo.");
			}

		} while (tempPin != pin);

	}

	protected void proveriStanje() {
		System.out.println("Stanje na Vasem racunu iznosi " + stanjeRacuna + " dinara.");
	}

	protected void podigniNovac(ATM objekat) {
		System.out.println("Unesite iznos: ");
		iznos = scanner.nextDouble();
		if (iznos <= 0 || iznos > objekat.ukupnoPara) {
			System.out.println("Transakcija nije moguca.");
		} else if (iznos % 100 != 0) {
			System.out.println("Nemoguce je isplatiti unetu sumu dostupnim novcanicama."); // Cifra mora biti deljiva sa 100 :)
		} else if (iznos > 30000) {
			System.out.println("Maksimalan iznos jedne transakcije je 30 000 dinara");
		} else if (iznos < 500) {
			System.out.println("Minimalan iznos koji mozete podici je 500 dinara.");
		} else {
			objekat.ukupnoPara = objekat.ukupnoPara - iznos;
			stanjeRacuna = stanjeRacuna - iznos;
			System.out.println("Podigli ste " + iznos + " dinara.");
		}
	}

	protected void promeniPin() {
		System.out.print("Unesite novi pin: ");
		int tempPin = scanner.nextInt();
		if (tempPin > 9999 || tempPin < 1000) { // pin mora biti cetvorocifreni broj i ne moze poceti nulom
			System.out.println("Nije moguce uneti takav pin.");
		} else {
			System.out.println("Uspesno ste promenili pin.");
			pin = tempPin;
		}
	}

}
