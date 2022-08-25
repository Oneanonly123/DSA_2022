package Bitwise;

public class OddorEven {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(oddeven(n));
    }

    // if AND(&) of last number is 1 that odd
    static boolean oddeven(int n) {
        if ((n & 1) == 1) {
            return false;
        }
        return true;
    }

}