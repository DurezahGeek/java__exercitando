// SistemaMedida.java

// Modo condicional if/else

import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua tamanho de roupa:");
        String sigla = scanner.next();

		if(sigla.equals("P"))
			System.out.println("PEQUENO");
		else if(sigla.equals("M"))
			System.out.println("MÉDIO");
		else if(sigla.equals("G"))
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
		
	}
}
