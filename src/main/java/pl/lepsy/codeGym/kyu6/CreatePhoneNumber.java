package pl.lepsy.codeGym.kyu6;

public class CreatePhoneNumber {

    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    public static String createPhoneNumber(int[] numbers) {

        String phoneNumber = ("(xxx) xxx-xxxx");
        String test = "123";

        for (int i : numbers){
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;

//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());


//        String stringNumbers = "";
//        for (int i : numbers){
//            stringNumbers += i;
//        }
//        String zeroTwoNumbers = String.valueOf(stringNumbers).substring(0, 3);
//        String threeFiveNumbers = String.valueOf(stringNumbers).substring(3, 6);
//        String fiveNineNumbers = String.valueOf(stringNumbers).substring(6,10);
//
//        return "(" + zeroTwoNumbers + ")" + threeFiveNumbers + "-" + fiveNineNumbers;
    }
}
