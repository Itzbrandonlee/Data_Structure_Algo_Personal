package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    //Merge sort function
    public List<Integer> mergeSort(List<Integer> array) {
        if(array.size() == 1){
            return array;
        }

        List<Integer> left = array.subList(0, array.size() / 2); //splits list from beginning to the middle of the array
        List<Integer> right = array.subList(array.size() / 2, array.size()); // splits list starting from the middle to the end of the array
        System.out.println("left:" + left);
        System.out.println("right:" + right);
        return merge(mergeSort(left), mergeSort(right));
    }

    //merge function
    public List<Integer> merge(List<Integer> left, List<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < left.size() && rightIndex < right.size()) { //as long as the left index and right index are smaller than the split sub arrays
            if(left.get(leftIndex) < right.get(rightIndex)) { //if left is less than the right, left goes first and increases the index #
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex)); //sale, if right is smaller then left, right goes first and increase rights index in the smaller array
                rightIndex++;
            }
        }
        System.out.println("new start");
        System.out.println("left" + left);
        System.out.println("right" + right);
        List<Integer> leftRemaining = left.subList(leftIndex, left.size()); //creates of list of remaining in the left
        List<Integer> rightRemaining = right.subList(rightIndex, right.size()); //creates a list of what remaining the in right
        //adds them to the end of the result
        result.addAll(leftRemaining);
        result.addAll(rightRemaining);

        return result;
    }

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

        System.out.println(sort.mergeSort(numbers));
    }
}
