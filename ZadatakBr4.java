import java.util.Scanner;
public class ZadatakBr4 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		
		int broj = unos.nextInt();
		
		System.out.println("Naopako, taj broj izgleda ovako: ");
		
		while (broj!=0) {
			int broj1 = broj%10;
			System.out.print(broj1);
			broj=broj/10;
		}
		
	}
}