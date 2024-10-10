
import java.util.Scanner;

public class CountWords{
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = countWords(line);
        System.out.print(num);
    }
}