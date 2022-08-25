package StringRecursion;

import java.util.ArrayList;

// Permutation and Combination 
// Subset - Non Adjacent Collection
public class SubSet {
    public static void main(String[] args) {
        // System.out.println(subSequence("", "abc"));
        ArrayList<String> result = new ArrayList<>();
        System.out.println(subSequen("", "abc", result));
    }

    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));

    }

    static ArrayList<String> subSequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSequence(p + ch, up.substring(1));
        ArrayList<String> right = subSequence(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<Integer> result = new ArrayList<>();

    static ArrayList<String> subSequen(String p, String up, ArrayList<String> result) {
        if (up.isEmpty()) {
            result.add(p);
            return result;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSequence(p + ch, up.substring(1));
        ArrayList<String> right = subSequence(p, up.substring(1));

        result.addAll(left);
        result.addAll(right);

        return result;
        // result.add(p);
        // return subSequen(p + ch, up.substring(1), result);
        // return subSequen(p, up.substring(1), result);

    }

}
