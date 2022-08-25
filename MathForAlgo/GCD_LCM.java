package MathForAlgo;

// HCF can be find by find the minimum value that 

// we can get by putting the value of Integer

// LCM - minimum no divisible by both

public class GCD_LCM {

    public static void main(String[] args) {
        System.out.println(lcm(4, 8));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b / gcd(a, b));
    }

}
