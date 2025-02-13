
import java.util.ArrayList;

class SortArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        int[] arr = {11, 10, 9, 9, 8, 8, 7, 6, 4, 4, 2};

        for (var n : arr) {
            if (!arr2.contains(n)) {
                arr2.add(n);
            }
        }
        System.out.println(arr2);

    }
}
