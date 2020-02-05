import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean kraj = false;
		Klijent k = new Klijent(50000);
		ATM bankomat = new ATM();

		k.unesiPin();

		do {
			int opcija;
			bankomat.opcije();
			opcija = scanner.nextInt();

			switch (opcija) {
			case 1:
				k.proveriStanje();
				break;
			case 2:
				k.podigniNovac(bankomat);
				break;
			case 3:
				k.promeniPin();
				k.unesiPin(); // potvrda pina
				break;
			case 4:
				kraj = true;
				System.out.println("Hvala sto nam verujete! :)))");
				break;
			default:
				System.out.println("Uneli ste nepostojecu opciju.");
				break;
			}

		} while (kraj != true);

		scanner.close();
		
	}

}
