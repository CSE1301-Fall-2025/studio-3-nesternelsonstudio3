import java.util.Scanner;
import java.lang.Math;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number we should go up to: ");
        int len = sc.nextInt();
        int[] primeArray = new int[len];
        double n = Math.sqrt(len);
        for (int i = 0; i < len; i++) {
            primeArray[i] = i + 1;
        }
        for (int i = 1; i < n; i++) {
            if (primeArray[i] != 0) {
                for (int j = 2 * i + 1; j < len; j = j + primeArray[i]) {
                    primeArray[j] = 0;
                }
            }
        }
        for (int k = 0; k < len; k++) {
            if (primeArray[k] != 0) {
                System.out.print(primeArray[k] + " ");
            }
        }
    }
}
