import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = sc.nextInt();
        int step = sc.nextInt();
        int c;
        for(int i = min; i <= max; i = i + step) {
            c = (int)((5.0/9) * (i - 32));  // Correct division
            System.out.println(i + " " + c);
        }
    }
}
