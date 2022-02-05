import examples.BubbleSort;
import examples.Examples;
import examples.SelectionSort;

import java.util.Arrays;

public class BigOApplication {
    public static void main(String[] args) {

        //O(1)
        //Examples.imprimirNumero(100000);

        //O(N)
        //Examples.imprimirAteNumero(10000);

        //O(N^2)
        //Examples.imprimirQuadradoDeNumero(3);
        //Examples.imprimirQuadradoDeNumeroOtimizado(3);


        //ORDENACAO

        int arr[] = {2,58,43,78,1,10};
        //Selection Sort
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        int arr2[] = {21,8,143,87,12,13};
        BubbleSort.bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
