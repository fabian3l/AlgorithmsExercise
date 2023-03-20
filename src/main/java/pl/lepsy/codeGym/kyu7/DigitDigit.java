package pl.lepsy.codeGym.kyu7;

public class DigitDigit {
    public static int squareDigits(int n) {
        String numberString = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<numberString.length(); i++){
            int actualNumberInt = Character.getNumericValue(numberString.charAt(i));
            int square = actualNumberInt*actualNumberInt;
            String actualNumberString = Integer.toString(square);
            sb.append(actualNumberString);
        }
        String result = sb.toString();
        int resultInt = Integer.parseInt(result);
        return resultInt;
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}
