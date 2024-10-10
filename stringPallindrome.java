
import java.util.Scanner;

public class stringPallindrome {
    public static boolean pllindromeStr(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        if(pllindromeStr(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("Noooo");
        }
    }
}
