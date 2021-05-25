import java.util.Arrays;

public class SelectionSort {
    // Fernando Oliveira da Costa
    // RA: 1110481923055
    // Tema: Selection Sort

    public static void main(String[] args) {
        int[] numeros = { 10, 7, 2, 12, 5, 9 };
        System.out.println("Lista A: "+ Arrays.toString(numeros));
        System.out.println("Lista B: "+ Arrays.toString(selectionSort(numeros)));
    }

    public static int[] selectionSort(int[] lista) {
        int n = lista.length;

        for (int posInicial = 0; posInicial < n - 1; posInicial++) {

            int menorIndex = posInicial;
            for (int i = posInicial; i < n; i++) {
                if (lista[i] < lista[menorIndex]) {
                    menorIndex = i;
                }
            }

            if (lista[posInicial] > menorIndex) {
                int aux = lista[posInicial];
                lista[posInicial] = lista[menorIndex];
                lista[menorIndex] = aux;
            }
        }
        return lista;
    }
}