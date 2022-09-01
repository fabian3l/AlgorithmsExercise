package pl.lepsy.codeGym.kyu5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Scramblies {
    public static void main(String[] args) {

        System.out.println(scramble("scriptingjava","javascript"));

    }

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> letters = countLetters(str1);
        Map<Character, Integer> word = countLetters(str2);



        for (Character c : word.keySet()){

            System.out.println(c + " " + word.get(c));
            Integer n = letters.get(c);
            if (n == null || n < word.get(c)){
                return false;
            }
        }
        return true;
    }
    private static Map<Character, Integer> countLetters(String s){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            Integer n = map.get(c);
            if (n == null){
                map.put(c, 1);
            }else{
                map.put(c, n+1);
            }
        }
        return map;
    }
        //rozwiazanie z Collections Map



        //najlepsze rozwiazanie

//        if (str2.length() > str1.length()) return false;
//
//        for (String s : str2.split("")){
//            if (!str1.contains(s)) return false;
//            str1.replaceFirst(s,"");
//        }
//        return true;

        //Moje rozwiazanie
//
//        String letters = str1.toLowerCase();
//        String word = str2.toLowerCase();
//
//        char[] letterArray = letters.toCharArray();
//        char[] wordArray = word.toCharArray();
//
//        boolean result = false;
//        int count = 0;
//
//
//        for (int i = 0; i < letterArray.length; i++) {
//            for (int j = 0; j < wordArray.length; j++) {
//                if (letterArray[i] == wordArray[j]) {
//                    wordArray[j] = ' ';
//                    count++;
//                    break;
//                }
//            }
//        }
//
//        if (count == word.length()) {
//            result = true;
//        }
//        return result;
}
