public class L04G {
    public static void main(String[] args){
        int numero = 1;

        do {
            if (numero % 2 != 0) {
                long fatorial = 1;
                int i = 1;

                do {
                    fatorial = fatorial * i;
                    i++;
                } while (i <= numero);

                System.out.println("Fatorial de " + numero + " = " + fatorial);
            }
            numero++;
        } while (numero <= 10);
    }
}
