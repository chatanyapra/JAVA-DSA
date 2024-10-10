
// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FirstLastElem {
    public static int countNum(int[] arr, int target){
        int c = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                c++;
            }
        }
        return c;
    }
    public static int[] searchRange(int[] nums, int target, int count) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int pos = 1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target && pos == 1){
                arr[0] = i;
                pos++;
            }
            else if (nums[i] == target && pos == count) {
                arr[1] = i;
                break;
            }
            else if(nums[i] == target){
                pos++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("array- " + i + " - ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Target value - ");
        int target = sc.nextInt();
        int count = countNum(arr, target);
        int[] res = searchRange(arr, target, count);
        System.out.println(Arrays.toString(res));
    }
}
