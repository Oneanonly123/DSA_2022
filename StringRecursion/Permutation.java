package StringRecursion;

import java.util.ArrayList;

import javax.annotation.processing.SupportedOptions;

public class Permutation {
    public static void main(String[] args) {
        permu("abc", "");
    }

    // static void permutation(String p, String up) {
    // if (up.isEmpty()) {
    // System.out.println(p);
    // return;
    // }

    // char ch = up.charAt(0);

    // for (int i = 0; i <= p.length(); i++) {
    // String f = p.substring(0, i);
    // String s = p.substring(i, p.length());
    // permutation(f + ch + s, up.substring(1));
    // }

    // }

    // static ArrayList<String> permutationRet(String p, String up) {
    // if (up.isEmpty()) {
    // ArrayList<String> list = new ArrayList<>();
    // list.add(p);
    // return list;
    // }

    // ArrayList<String> ans = new ArrayList<>();

    // char ch = up.charAt(0);

    // for (int i = 0; i <= p.length(); i++) {
    // String f = p.substring(0, i);
    // String s = p.substring(i, p.length());
    // ans.addAll(permutationRet(f + ch + s, up.substring(1)));
    // }
    // return ans;
    // }

    // static int permutationCount(String p, String up) {
    // if (up.isEmpty()) {
    // return 1;
    // }

    // char ch = up.charAt(0);

    // int count = 0;

    // for (int i = 0; i <= p.length(); i++) {
    // String f = p.substring(0, i);
    // String s = p.substring(i, p.length());
    // count = count + permutationCount(f + ch + s, up.substring(1));
    // }
    // return count;
    // }

    // another way to do the same problem

    // Time Complexity - O(N!)
    // as first position can be filled in N ways , second in N-1 and so on
    static void permu(String up, String p) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char currChar = up.charAt(i);

            String newStr = up.substring(0, i) + up.substring(i + 1);
            permu(newStr, p + currChar);

        }
    }
}
