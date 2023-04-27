package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] array){ //O(n^2) Time complexity
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length -1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        BubbleSort sort = new BubbleSort();

        System.out.println(Arrays.toString(sort.bubbleSort(numbers)));

    }
}

//Sorts the items by iterating through each array over and over again assigning temp values until the highest number is at the top.
