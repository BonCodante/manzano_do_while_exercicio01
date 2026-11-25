import java.util.Scanner;

public class L04I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor;
        int maior = 0;
        int menor = 0;
        boolean primeiroNumero = true;

        do {
            System.out.print("Digite um valor inteiro positivo (ou negativo para sair): ");
            valor = sc.nextInt();

            if (valor >= 0) {
                if (primeiroNumero) {
                    maior = valor;
                    menor = valor;
                    primeiroNumero = false;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                }
            }
        } while (valor >= 0);

        if (!primeiroNumero) {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }



        sc.close();

    }
}
