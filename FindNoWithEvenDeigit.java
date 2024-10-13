
import java.util.Arrays;

public class FindNoWithEvenDeigit {

    public static int FindDigits(int arr) {
        int digit = 0;
        while (arr > 0) {
            arr = arr / 10;
            digit++;
        }
        System.out.println("digit - " + digit);
        if (digit % 2 == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {12, 36, 345, 6, 7856};
        System.out.println(Arrays.toString(arr));
        int possibleNumbersEven = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = FindDigits(arr[i]);
            possibleNumbersEven = possibleNumbersEven + num;
        }
        System.out.println("possibleNumbersEven - " + possibleNumbersEven);
    }
}
