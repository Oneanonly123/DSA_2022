package RecursionLevel1;

public class ProdOfDigit {
    public static void main(String[] args) {
        System.out.println(prodOfDigit(1133));
    }

    static int prodOfDigit(int n) {

        if (n == 0) {
            return 1;
        }
        return prodOfDigit(n % 10) * n;
    }
}
