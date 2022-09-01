package pl.lepsy.codeGym;

import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {

        String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(s));
    }
    public static int findShort(String s) {

//        //sposob z petla
//        String[] array = s.split(" ");
//        int wordLength = Integer.MAX_VALUEg;
//        for (int i = 0; i < array.length; i++){
//            if (array[i].length() < wordLength){
//                wordLength = array[i].length();
//            }
//        }
//        return wordLength;

//        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();




        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }


}
