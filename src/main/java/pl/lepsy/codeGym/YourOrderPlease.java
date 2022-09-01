package pl.lepsy.codeGym;

public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
    public static String order(String words) {

        String[] stringArray = words.split(" ");
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < 10; i++){
            for (String word : stringArray){
                if (word.contains(String.valueOf(i))){
                    sb.append(word + " ");
                }
            }
        }
        return sb.toString().trim();
    }
}
