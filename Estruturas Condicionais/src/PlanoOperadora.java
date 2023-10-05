// Modo condicional convencional

import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale (Locale.US);
        System.out.println("Digite qual plano você tem interesse");
        String plano = scanner.next();
		
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
			
		
	}
}
