
public class BinarySearch {

    public static int binarySeaarch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = (start + (end - start)) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, 15, 19, 55, 58, 78, 89, 99};
        int target = -8;
        System.out.println("Binary search- ");
        System.out.println(binarySeaarch(arr, target));
    }
}
