import java.util.Scanner;

public class HCF {
    // Function to calculate HCF using the Euclidean algorithm
    public static long calculateHCF(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;  // Calculate remainder
            a = temp;   // Assign previous b to a
        }
        return a;  // a now contains the HCF
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        long A = sc.nextLong(); // Read first integer
        System.out.print("Enter B: ");
        long B = sc.nextLong(); // Read second integer

        // Calculate and display the HCF
        long hcf = calculateHCF(A, B);
        System.out.println("HCF: " + hcf);
        
        sc.close(); // Close the scanner
    }
}
