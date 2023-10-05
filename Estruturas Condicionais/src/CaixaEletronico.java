// CaixaEletronico.java

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor que quer solicitar:");
        double valorSolicitado = scanner.nextInt();
       
       double saldo = 25.0;
       
       if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo:" + saldo);

    }else
       System.out.println("Saldo insuficiente");


        System.out.println(saldo);


    }
}