package week7.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insertionsort {
    public static void main(String[] args) {
        insertionSort(Arrays.asList(3,4,2,1,5,9,6,7,3,2,6,5,7)).forEach(System.out::print);
    }

    public static List<Integer> insertionSort(List<Integer> arr) {
        Long beforeSort = System.currentTimeMillis();
        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i-1;
            while (j >= 0 && arr.get(j)>key){
                arr.set(j+1,arr.get(j));
                j = j-1;
            }
            arr.set(j+1, key);
        }
        Long afterSort = System.currentTimeMillis();
        System.out.println("Sorting took exactly: " + (afterSort - beforeSort) + " Milliseconds");
        return arr;
    }

}
