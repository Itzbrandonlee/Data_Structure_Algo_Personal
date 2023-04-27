package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public ArrayList<Integer> insertionSort(ArrayList<Integer> array){
        for(int i = 0; i < array.size(); i++){

            //if number is less than the first item add it to the beginning of the array
            if(array.get(i) <= array.get(0)){
                array.add(0, array.remove(i));
            } else {
                //if not check where the number would go
                if(array.get(i) < array.get(i - 1)) { //if it is less than the item before it
                    for(int j = 1; j < i; j++){ //loop again through the previous numbers before i
                        if(array.get(i) < array.get(j)) { //once i is less than j
                            array.add(j, array.remove(i)); //add j and remove i
                            break;
                        }
                    }

                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
        System.out.println(sort.insertionSort(numbers));
    }
}
