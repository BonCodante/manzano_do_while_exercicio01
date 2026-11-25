import java.util.Scanner;

public class L04J {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo (inteiro): ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor (inteiro): ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            int quociente = 0;
            int resto = dividendo;

            if (resto >= divisor) {
                do {
                    resto = resto - divisor;
                    quociente++;
                } while (resto >= divisor);
            }

            System.out.println("Resultado inteiro da divisão (quociente): " + quociente);
        }




        sc.close();



    }
}
