package pl.lepsy.codeGym;

import java.util.ArrayList;
import java.util.List;

public class Switchero {
    public static void main(String[] args) {
        System.out.println(switcheroo("aaacccbbb"));
    }
    public static String switcheroo(String x) {



        return x.replace('a', '_').replace('b','a').replace('_','b');
//        char[] strings = x.toCharArray();
//        List<Character> characterList = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++){
//            if (strings[i] == 'a'){
//                characterList.add('b');
//            }else if (strings[i] == 'b'){
//                characterList.add('a');
//            }else{
//                characterList.add(strings[i]);
//            }
//        }
//        String result = characterList.toString().replace(",", "").replace(" ","").replace("[","").replace("]","");
//        return result;
    }
}
