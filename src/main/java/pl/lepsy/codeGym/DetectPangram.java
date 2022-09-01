package pl.lepsy.codeGym;

public class DetectPangram {
    public static void main(String[] args) {


        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean check(String sentence){

        sentence.toLowerCase();

        boolean allLeterPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++){
            if (!sentence.contains(String.valueOf(ch))){
                allLeterPresent = false;
                break;
            }
        }

        return allLeterPresent;
    }
}
