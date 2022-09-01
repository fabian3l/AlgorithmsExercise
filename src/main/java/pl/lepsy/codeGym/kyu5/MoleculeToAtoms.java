package pl.lepsy.codeGym.kyu5;

import java.util.HashMap;
import java.util.Map;

public class MoleculeToAtoms {
    static int number;
    public static void main(String[] args) {
       int i =  number;
        String water = "H2O";
        getAtoms(water);


    }
    public static Map<String,Integer> getAtoms(String formula) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        char[] formulaArr = formula.toCharArray();

        for (int i = 0; i < formulaArr.length - 1; i++){
                if (Character.isDigit(formulaArr[i+1])){
                    stringIntegerMap.put(Character.toString(formulaArr[i]), Character.getNumericValue(formulaArr[1]));
                }
        }
        System.out.println(stringIntegerMap.get("O"));



        return new HashMap<String,Integer>();
    }

}
