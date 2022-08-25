package Bitwise;

// No of Digits in Base b of  of given Number n 
public class NoOfDigit {
    public static void main(String[] args) {
        int n = 6;
        int b = 2;

        int ans = (int) (Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}