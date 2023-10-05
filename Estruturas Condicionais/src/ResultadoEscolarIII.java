import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolarIII {
    // Cenário 1
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota");
        int nota = scanner.nextInt();
        
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}

