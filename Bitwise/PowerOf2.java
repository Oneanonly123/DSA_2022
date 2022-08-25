package Bitwise;

// given number is a power of 2 or not 
public class PowerOf2 {
    public static void main(String[] args) {
        powerOf2(5);
        System.out.println(powerOf2(8));
    }

    static boolean powerOf2(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}
