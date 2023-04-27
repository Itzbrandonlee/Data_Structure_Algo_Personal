package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] array){

        for(int i = 0; i < array.length; i++){
            int smallest = i; //set index as the min
            for(int j = i; j < array.length; j++){
                if(array[j] < array[smallest]){

                    //update the min if the current is lower then the previous
                    smallest = j;
                }
                int temp = array[i];
                array[i] = array[smallest];
                array[smallest] = temp;
                System.out.println(Arrays.toString(array));
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        SelectionSort sort = new SelectionSort();

        System.out.println(Arrays.toString(sort.selectionSort(numbers)));
    }
}

//uses the index of the item instead of the actual value instead ofl ike bubble sort.
//uses O(n^2) just like bubble sort. one of the slowest sorting methods.
