package pl.lepsy.codeGym;


import java.util.*;;
import java.util.stream.Collectors;

public class DemoTask {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        System.out.println(solution(numbers));
    }
    public static int solution(int[] A) {

        List<Integer> numberList = new ArrayList<>();
        int result = 0;

        for (int i : A){
            numberList.add(i);
        }
        numberList = numberList.stream().sorted().collect(Collectors.toList());


        for (int i = 0; i < numberList.size() - 1; i++){
            if (numberList.get(i) + 1 != numberList.get(i+1)){
                result = numberList.get(i) + 1;
            }
        }
        if (result < 0){
            result = 1;
        }else if (result == 0){
            result = numberList.get(numberList.size()-1) + 1;
        }

        return result;
    }
}
