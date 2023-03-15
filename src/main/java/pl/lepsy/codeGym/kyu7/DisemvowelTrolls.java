package pl.lepsy.codeGym.kyu7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        String[] vovels = {"a", "e", "i", "o", "u", "A", "E", "I","O","U"};

        for (String vovel : vovels) {
            str = str.replace(vovel, "");

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));


    }
}
