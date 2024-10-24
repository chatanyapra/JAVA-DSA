
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Second array-");
        for (int i = 0; i < size; i++) {
            arr1.add(sc.nextInt());
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr.get(i) == arr1.get(j)) {
                    System.out.println("same element - " + arr.get(i));
                }
            }
        }
        // System.out.println(arr);
        // System.out.println("Remove an element at index - ");
        // int rem = sc.nextInt();
        // arr.remove(rem);
        // System.out.println(arr);

    }
}
