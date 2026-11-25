public class L04D {
    public static void main(String[] args) {
        int quadro = 1;
        double graosNoQuadro = 1.0;
        double totalGraos = 0.0;

        do {
            totalGraos = totalGraos + graosNoQuadro;
            graosNoQuadro = graosNoQuadro * 2.0;
            quadro++;
        } while (quadro <= 64);

        System.out.println("Total de grãos de trigo no tabuleiro: " + totalGraos);
    }
}
