public class L04C {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Números divisíveis por 4 menores que 200:");
        do {
            if (contador % 4 == 0) {
                System.out.println(contador);
            }
            contador++;
        } while (contador < 200);
    }
}
