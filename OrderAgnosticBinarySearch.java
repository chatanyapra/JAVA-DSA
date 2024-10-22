
public class OrderAgnosticBinarySearch {

    public static int orderAgosticBS(int[] arr, int target) {
        System.out.println("Sorted array");
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            boolean isAsc = arr[start] < arr[end];
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 8, 19, 24, 37, 55, 68, 79, 82};
        int[] arr = {88, 77, 65, 59, 38, 21, 17, 12};
        int targ = 38;
        int ans = orderAgosticBS(arr, targ);
        System.out.println(ans);
    }
}
