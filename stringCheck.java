import java.util.Scanner;

public class stringCheck {
    public static boolean checkString(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        else{
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean br = checkString(str1, str2);
        System.out.println(br);
    }    
}
// check the string length and the character are same or not--------