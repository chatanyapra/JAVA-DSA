
public class FloorOfNumberInBS {

    public static int floorNoBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = (start + (end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 12, 14, 16, 19, 22};
        // int[] arr = {22, 19, 16, 14, 12, 4, 2, 1};
        int targ = 7;
        int ans = floorNoBS(arr, targ);
        System.out.println("Ans = " + ans);
    }
}
