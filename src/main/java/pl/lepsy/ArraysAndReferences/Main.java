package pl.lepsy.ArraysAndReferences;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //7.3
        int[] array = {4, 2, -2, 10};
        System.out.println(indexOfMax(array));

        //7,4
        System.out.println(sieve(15));

    }

    //7.3
    public static int indexOfMax(int[] array){

        //ZWYKLA PETLA FOR
//        int max = array[0];
//        for (int i = 1; i <= array.length-1; i++){
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//        return max;


        //PETLA FOREACH
        int max = array[0];
        for (int i : array){
            if (max < i){
                max = i;
            }
        }
        return max;
    }
    //7.4
    public static boolean[] sieve(int n){

        boolean[] liczbyPierwsze = new boolean[1];

        for (int i = 0; i <= n; i++){

            for (int j = 0; j <=n; j++){

                if (i % j != 0){
                    liczbyPierwsze[i] = true;
                    liczbyPierwsze = Arrays.copyOf(liczbyPierwsze, liczbyPierwsze.length+1);
                }
            }
        }
        return liczbyPierwsze;
    }

}
