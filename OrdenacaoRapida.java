public class OrdenacaoRapida {
    public static void ordenar(int[] arr, int inicio, int ultimo) {
        if (inicio < ultimo) {
            int indicePivo = particionar(arr, inicio,ultimo);

            ordenar(arr, inicio, indicePivo - 1);
            ordenar(arr, indicePivo + 1,ultimo);
        }
    }

    private static int particionar(int[] arr, int inicio, int ultimo) {
        //Linha 13 é a escolha do pivo
        int pivo = arr[ultimo];
        int i = inicio - 1;

        imprimirArray(arr, ultimo);

        for (int j = inicio; j < ultimo; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ultimo];
        arr[ultimo] = temp;

        imprimirArray(arr, i + 1);

        return i + 1;
    }
    private static void imprimirArray(int[] arr, int indicePivo) {
        System.out.print("Ordenação Rápida - Pivô " + arr[indicePivo] + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}