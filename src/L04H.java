import java.util.Scanner;

public class L04H {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        double areaTotal = 0;
        String continuar;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = sc.nextLine();

            System.out.print("Digite a largura do cômodo (m): ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo (m): ");
            double comprimento = sc.nextDouble();
            sc.nextLine();

            double areaComodo = largura * comprimento;
            areaTotal = areaTotal + areaComodo;

            System.out.println("Área do(a) " + nomeComodo + ": " + areaComodo + " m²");

            System.out.print("Deseja continuar calculando novos cômodos? (SIM / NAO): ");
            continuar = sc.nextLine();
        } while (!continuar.equalsIgnoreCase("NAO") && !continuar.equalsIgnoreCase("NÃO"));

        System.out.println("Área total acumulada da residência: " + areaTotal + " m²");



        sc.close();

    }
}
