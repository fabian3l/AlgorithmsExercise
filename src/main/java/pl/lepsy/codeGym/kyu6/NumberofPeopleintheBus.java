package pl.lepsy.codeGym.kyu6;

import java.util.ArrayList;

public class NumberofPeopleintheBus {

    public static int countPassengers(ArrayList<int[]> stops) {

        return stops.stream().mapToInt(element -> element[0] - element[1]).sum();

//        int actualValue = 0;
//
//        for(int[] element : stops){
//            actualValue += element[0];
//            actualValue -= element[1];
//        }
//
//        return actualValue;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        System.out.println(countPassengers(list));
    }
}
