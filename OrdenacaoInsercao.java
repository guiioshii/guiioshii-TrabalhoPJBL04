public class OrdenacaoInsercao {
    public static void ordenar(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = chave;
            imprimirArray(arr, i);
        }
    }

    private static void imprimirArray(int[] arr, int iteracao) {
        System.out.print("Ordenação por Inserção - Iteração " + iteracao + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
