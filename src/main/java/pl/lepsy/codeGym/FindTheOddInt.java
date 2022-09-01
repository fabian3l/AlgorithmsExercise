package pl.lepsy.codeGym;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }
    public static int findIt(int[] a) {

        int result = 0;


        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        return result;
    }
}
