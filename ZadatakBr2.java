import java.util.Scanner;
public class ZadatakBr2 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		int unosKorisnika;
		int pozitivniBrojevi=0;
		int negativniBrojevi=0;
		int suma=0;
		int prosjek=0;
		
		System.out.println("Unesite cijele brojeve (0 prekida unos): ");
				
		while ((unosKorisnika=unos.nextInt())!=0) {
			
			if (unosKorisnika>0) 
				pozitivniBrojevi++;
			
			else 
				negativniBrojevi++;
			
			
			suma+=unosKorisnika;
			prosjek=(suma/(negativniBrojevi+pozitivniBrojevi));
		}
		

		System.out.println("Broj pozitivnih bojeva iznosi " + pozitivniBrojevi + ", broj negativnih iznosi " + negativniBrojevi + " .");
		System.out.println("Zbir brojeva iznosi " + suma + " .");
		System.out.println("Prosjek brojeva iznosi " +  prosjek + " .");
		
	}
}