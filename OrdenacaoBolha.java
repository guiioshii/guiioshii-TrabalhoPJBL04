public class OrdenacaoBolha {
    public static void ordenar(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            imprimirArray(arr, i + 1);
        }
    }

    private static void imprimirArray(int[] arr, int iteracao) {
        System.out.print("Ordenação Bolha - Iteração " + iteracao + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
