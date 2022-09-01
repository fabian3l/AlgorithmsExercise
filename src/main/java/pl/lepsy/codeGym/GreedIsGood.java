package pl.lepsy.codeGym;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GreedIsGood {
    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2,4,4,5,4}));
        //250
    }
    public static int greedy(int[] dice){

        int points = 0 ;
        int[] numbersOfDie = {0, 0, 0, 0, 0, 0};
        int[] valuesOne = {100, 0, 0, 0, 50, 0};
        int[] valuesThree = {1000, 200, 300, 400, 500, 600};

        for (int die : dice){
            numbersOfDie[die-1]++;
        }
        for (int i = 0; i <= numbersOfDie.length; i++){
            points += (numbersOfDie[i]/3*valuesThree[i]) + (numbersOfDie[i]%3 * valuesOne[i]);
        }
        return points;

//        MOJE ROZWIAZANIE

//        int points = 0;
//
//        int one = 0;
//        int two = 0;
//        int three = 0;
//        int four = 0;
//        int five = 0;
//        int six = 0;
//
//        for (int number : dice) {
//            if (number == 1) {
//                one++;
//                if (one == 3){
//                    points += 1000;
//                }
//            } else if (number == 2) {
//                two++;
//                if (two == 3){
//                    points += 200;
//                }
//            } else if (number == 3) {
//                three++;
//                if (three == 3){
//                    points += 300;
//                }
//            } else if (number == 4) {
//                four++;
//                if (four == 3){
//                    points += 400;
//                }
//            } else if (number == 5) {
//                five++;
//                if (five == 3){
//                    points += 500;
//                }
//            } else if (number == 6) {
//                six++;
//                if (six == 3){
//                    points +=600;
//                }
//            }
//        }
//
//        if (one == 1){
//            points += 100;
//        }else if(one == 2){
//            points += 200;
//        }else if (one == 4){
//            points += 100;
//        }else if (one == 5){
//            points += 200;
//        }
//
//        if (five == 1){
//            points += 50;
//        }else if (five == 2){
//            points += 100;
//        }else if (five == 4){
//            points += 50;
//        }else if (five == 5){
//            points += 100;
//        }
//
//        return points;
    }
}
