import java.util.Scanner;
public class ZadatakBr1 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite mjesečni iznos uplate: ");
		
		double uplata = unos.nextDouble();
		
		System.out.println("Unesite broj mjeseci nakon kojeg bi htjeli znati stanje računa: ");
		
		double mjesec = unos.nextDouble();
		
		double racun = 0;
		double stopa = (1 + 0.00417);
		
	    for (int i = 0; i < mjesec; i++) {
            racun = (uplata + racun) * stopa;
        }

        System.out.println("Nakon " + mjesec + " mjeseci, stanje na vašem računu će biti " + racun + " KM.");

	}
}
