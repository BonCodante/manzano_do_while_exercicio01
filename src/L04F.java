import java.util.Scanner;

public class L04F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double somatorio = 0;
        int totalValores = 0;
        double valor;

        do {
            System.out.print("Digite um valor positivo (ou negativo para encerrar): ");
            valor = sc.nextDouble();

            if (valor >= 0) {
                somatorio = somatorio + valor;
                totalValores++;
            }
        } while (valor >= 0);

        if (totalValores > 0) {
            double media = somatorio / totalValores;
            System.out.println("Total do somatório: " + somatorio);
            System.out.println("Média aritmética: " + media);
            System.out.println("Total de valores lidos: " + totalValores);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }


        sc.close();

    }
}
