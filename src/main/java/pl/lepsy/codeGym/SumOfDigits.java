package pl.lepsy.codeGym;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digital_root(55));
    }
    public static int digital_root(int num) {

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        sum = (sum <10) ? sum : digital_root(sum);

        return sum;
    }
}
