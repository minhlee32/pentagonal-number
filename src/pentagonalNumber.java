import java.util.Scanner;

public class pentagonalNumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n = scanner.nextInt();
        System.out.println(n + " equals to pentagonal number is: " + getPentagonalNumber(n));
    }
    public static int getPentagonalNumber(int n) {
        int pentagonalNumber = 1;
        while (n > 0) {
            pentagonalNumber = n * (3 * n - 1) / 2;
            return pentagonalNumber;
        }
        return pentagonalNumber;
    }
}
