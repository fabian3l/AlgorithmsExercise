package pl.lepsy.codeGym.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheParityOutliner {
    public static void main(String[] args) {

        int[] exampleTest1 = {-6, 6,8,-4,-3};
        System.out.println(find(exampleTest1));
        System.out.println(-3 % 2);
    }
    static int find(int[] integers){

        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1: 0;

        return Arrays.stream(integers).parallel()
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
//        List<Integer> evenNumber = new ArrayList<>();
//        List<Integer> oddNumber = new ArrayList<>();
//        int result = 0;
//
//        for (int i : integers){
//            if (i % 2 == 0){
//                evenNumber.add(i);
//            }else if (i % 2 == 1 || i % 2 == -1){
//                oddNumber.add(i);
//            }
//        }
//
//       if (evenNumber.size() == 1){
//           for (int i : evenNumber){
//               if (i % 2 == 0){
//                   result = i;
//               }
//           }
//       }else if (oddNumber.size() == 1){
//           for (int i : oddNumber){
//               if (i % 2 == 1 || i % 2 == -1){
//                   result = i;
//               }
//           }
//       }
//       return result;
//    }
}
