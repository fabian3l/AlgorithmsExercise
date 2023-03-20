package pl.lepsy.codeGym.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildTower {

    public static String[] towerBuilder(int nFloors) {

        String[] array = new String[nFloors];
        int floorLength = 1;
        for (int i=1; i<=nFloors; i++){
            String spaces = " ".repeat(nFloors - i);
            String stars = "*".repeat(floorLength);
            array[i-1] = spaces + stars + spaces;
            floorLength += 2;
        }
        return array;
    }

    public static void main(String[] args) {
        towerBuilder(3);
    }
}
