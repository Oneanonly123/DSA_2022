package StringRecursion.InterViewQues;

import java.util.ArrayList;

// Asked in Amazon 
public class Dice {
    public static void main(String[] args) {
        diceComb("", 4);
        // System.out.println(diceCombRet("", 4));
    }

    static void diceComb(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceComb(p + i, target - i);

        }
    }

    static ArrayList<String> diceCombRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceCombRet(p + i, target - i));

        }
        return ans;
    }
}
