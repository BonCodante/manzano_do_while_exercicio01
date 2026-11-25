public class L04B {
    public static void main(String[] args){

        int contador = 1;
        int somatorio = 0;
        do {
            if (contador % 2 == 0) {
                somatorio = somatorio + contador;
            }
            contador++;
        } while (contador <= 500);

        System.out.println("O somatório dos pares de 1 até 500 é: " + somatorio);
    }
}
