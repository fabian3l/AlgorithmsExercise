package pl.lepsy.codeGym;

import java.util.Arrays;

public class GoodVsEvil {
    public static void main(String[] args) {
        System.out.println(battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
    public static String battle(String goodAmounts, String evilAmounts) {

        int[] goodValues = {1, 2, 3, 3, 4, 10};
        int[] evilValues = {1, 2, 2, 2, 3, 5, 10};

//        int[] goodAmountsArr = Arrays.stream(goodAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
//        int[] evilAmountArr = Arrays.stream(evilAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

        int[] goodAmountsArr = Arrays.stream(goodAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int[] evilAmountArr = Arrays.stream(evilAmounts.split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

        int goodPoints = 0;
        int evilPoints = 0;
        for (int i = 0; i < goodAmountsArr.length; i++){
            goodPoints += goodAmountsArr[i] * goodValues[i];
        }
        for (int i = 0; i < evilAmountArr.length; i++){
            evilPoints += evilAmountArr[i] * evilValues[i];
        }

        String result = "";
        if (goodPoints == evilPoints){
            result = "Battle Result: No victor on this battle field";
        }else if (goodPoints > evilPoints){
            result = "Battle Result: Good triumphs over Evil";
        }else if (goodPoints < evilPoints){
            result = "Battle Result: Evil eradicates all trace of Good";
        }

        return result;
    }
}
