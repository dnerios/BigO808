package examples;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        //O(N^2)
        for(int i = 0; i < arr.length; i++) {
            int index = i; //0
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }

            int menorNumero = arr[index];
            arr[index] = arr[i];
            arr[i] = menorNumero;
        }
    }
}
