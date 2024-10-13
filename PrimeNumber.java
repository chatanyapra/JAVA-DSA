
import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not prime");
        }
        sc.close();
    }
}
