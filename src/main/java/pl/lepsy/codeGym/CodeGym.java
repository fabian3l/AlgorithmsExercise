package pl.lepsy.codeGym;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class CodeGym {
    public static void main(String[] args) {

        System.out.println(validatePin(".234"));

    }

    public static boolean validatePin(String pin) {


        String regex = "\\d+";

        if (pin.matches(regex)){
            if (pin.length() == 4 || pin.length() == 6){
                return true;
            }
        }
        return false;
    }
}
