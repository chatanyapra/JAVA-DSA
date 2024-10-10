import java.util.Arrays;

public class StringDisticnk {

    public static void stringCompare(String[] str) {
        // Create the result array with the same length as input
        String[] result = new String[str.length];
        int pos = 0; // To track distinct elements in the result arry
        for(int i = 0; i<str.length; i++){
            boolean dublicate = false;
            String s1 = str[i];

            for(int j = 0; j< pos; j++){
                String s2 = result[j];
                if(s1.equals(s2)){
                    dublicate = true;
                    break;
                }
            }
            if(!dublicate){
                result[pos] = s1;
                pos++;
            }
        }
        
        String[] newStr = new String[pos];
        for(int k = 0; k < pos; k++){
            newStr[k] = result[k];
        }
        System.out.println("-----"+Arrays.toString(newStr));
    }

    public static void main(String[] args) {
        String[] str = {"apple", "orange", "banana", "apple", "grape", "banana", 
                        "apple", "orange", "grape", "kiwi", "kiwi", "kiwi"};
        System.out.println("Input: " + Arrays.toString(str));
        stringCompare(str);
    }
}
