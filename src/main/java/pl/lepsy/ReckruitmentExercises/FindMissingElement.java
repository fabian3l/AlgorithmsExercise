package pl.lepsy.ReckruitmentExercises;

import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 5, 7, 4};
        System.out.println(findMissingElement(someArray));
    }


    public static int findMissingElement(int[] arrayNumber) {

        int[] sorted = Arrays.stream(arrayNumber).sorted().toArray();
        int sortedLengthPlusOne = sorted.length+1;
        int sumArray = ((2 * sorted[0] + sorted.length)/2) * sortedLengthPlusOne;

        int sum = Arrays.stream(arrayNumber).sum();
        return sumArray - sum;

    }

//        int[] sortedArray = Arrays.stream(arrayNumber).sorted().toArray();
//        for (int i = 0; i < arrayNumber.length; i++){
//
//            if (sortedArray[i] + 1 != sortedArray[i+1]){
//                return sortedArray[i] + 1;
//            }
//        }
//        return 0;
//    }

}
