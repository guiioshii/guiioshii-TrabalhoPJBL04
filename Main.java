import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayEntrada = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array Original: " + Arrays.toString(arrayEntrada));
        OrdenacaoBolha.ordenar(arrayEntrada.clone());
        System.out.println();

        System.out.println("Array Original: " + Arrays.toString(arrayEntrada));
        OrdenacaoInsercao.ordenar(arrayEntrada.clone());
        System.out.println();

        System.out.println("Array Original: " + Arrays.toString(arrayEntrada));
        OrdenacaoRapida.ordenar(arrayEntrada.clone(), 0, arrayEntrada.length - 1);
    }
}