
import java.util.Scanner;

public class indexVowel {
    public static boolean  isVowel(char str){
        str = Character.toLowerCase(str);
        return str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i<str.length(); i++){
            if(isVowel(str.charAt(i))){
                System.out.println(i+", ");
            }
        }
    }
}
