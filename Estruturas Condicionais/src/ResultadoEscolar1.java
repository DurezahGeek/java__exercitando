import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar1 {
    public static void main(String[] args) {
       Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota");
        double nota = scanner.nextDouble();
       

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
