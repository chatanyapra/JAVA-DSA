
import java.util.Scanner;

public class ToggleString {
    public static void toggleStr(String str){
        String str2 = "";
        for(int i = 0; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                str2 = str2 + Character.toLowerCase(str.charAt(i)); 
            }else{
                str2 = str2 + Character.toUpperCase(str.charAt(i)); 
            }
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name - ");
        String str = sc.next();
        toggleStr(str);
    }
}
