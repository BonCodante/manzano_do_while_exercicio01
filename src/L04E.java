import java.util.Scanner;

public class L04E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        long somatorioFatorial = 0;

        do {
            System.out.print("Digite o " + contador + "º valor inteiro: ");
            int valor = sc.nextInt();

            long fatorial = 1;
            int i = 1;

            if (valor > 0) {
                do {
                    fatorial = fatorial * i;
                    i++;
                } while (i <= valor);
            }

            somatorioFatorial = somatorioFatorial + fatorial;
            contador++;
        } while (contador <= 15);

        System.out.println("Somatório dos fatoriais: " + somatorioFatorial);
        sc.close();
}
 }
