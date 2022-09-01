package pl.lepsy.codeGym;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SimplePigLatin {
    public static void main(String[] args) {

        System.out.println(pigIt("Pig , latin is cool !")); // igPay atinlay siay oolcay

    }
    public static String pigIt(String str) {
        String[] arr = str.split(" ");


        StringBuilder stringBuilder = new StringBuilder();


        for (String word : arr){

            System.out.println(word);
            if(Pattern.matches("(.*)[\\p{P}](.*)", word)){
                stringBuilder.append(word);
            }else{
                word = word.substring(1, word.length()) + word.charAt(0) + "ay";
                stringBuilder.append(word + " ");
            }
        }

        String result = stringBuilder.toString();

        return result.substring(0, result.length()-1);
    }
}
