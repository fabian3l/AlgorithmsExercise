package pl.lepsy.codeGym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {

        String test = "abcdeU";
        System.out.println(getCount(test));

    }
    public static int getCount(String str) {

        int numberOfVowel = 0;


        for (int i = 0; i < str.length(); i++){
            if (    str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' ||
                    str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U'
            ){
                numberOfVowel++;
            }
        }
        return numberOfVowel;
    }
}
