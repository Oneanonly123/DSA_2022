package StringRecursion.InterViewQues;

import java.util.ArrayList;

public class PhoneCombination {
    public static void main(String[] args) {
        System.out.println(phoneCombinationCount("", "23"));
    }

    static void phoneCombination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // character to add

            char ch = (char) ('a' + i);
            phoneCombination(p + ch, up.substring(1));

        }
    }

    static ArrayList<String> phoneCombinationRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // character to add

            char ch = (char) ('a' + i);
            ans.addAll(phoneCombinationRet(p + ch, up.substring(1)));

        }
        return ans;
    }

    static int phoneCombinationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // character to add

            char ch = (char) ('a' + i);
            count = count + phoneCombinationCount(p + ch, up.substring(1));

        }
        return count;
    }

}
