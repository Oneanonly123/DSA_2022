package Bitwise;

// Pascal Traingle
public class NoOfSetBit {
    public static void main(String[] args) {
        // int n = 10;
        System.out.println(noOfSetBits(9));
    }

    static int noOfSetBits(int n) {
        int count = 0;
        while (n > 0) {

            count++;
            n = n & (n - 1);
        }

        return count;

    }
}