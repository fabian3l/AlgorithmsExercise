package pl.lepsy.codeGym;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static void main(String[] args) {
        String test = "Hey fellow warriors";
        System.out.println(spinWords(test));
    }
    public static String spinWords(String sentence) {

        //ROZWIAZANIE 1

        String[] words = sentence.split(" ");

        for (int i = 0; i <  words.length; i++){
            if (words[i].length() >= 5){
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);

        //ROZWIAZANIE 2

//        return Arrays.stream(sentence.split(" "))
//                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
//                .collect(Collectors.joining(" "));

        //ROZWIAZANIE 3

//        String[] stringArray = sentence.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for (String word: stringArray){
//            if (word.length() < 5){
//                sb.append(word).append(" ");
//            }else{
//                StringBuilder reveresed = new StringBuilder();
//                for (int i = word.length() - 1; i >= 0; i--){
//                    reveresed.append(word.charAt(i));
//                }
//                sb.append(reveresed).append(" ");
//            }
//        }
//        String result = sb.toString();
//        return result.substring(0, result.length()-1);
    }
}
