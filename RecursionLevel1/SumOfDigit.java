package RecursionLevel1;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(344));
    }

    static int sumOfDigit(int n) {

        if (n == 0) {
            return 0;
        }
        return sumOfDigit(n / 10) + (n % 10);
    }
}
