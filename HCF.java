import java.util.Scanner;

class hcfnumber{
    public void checkLCM(int hcf, int A, int B){
        int lcm = (A * B)/hcf;
        System.out.println("LCM - "+ lcm);
    }
    public int checkHCF(int num, int num2){
        while(num2!=0){
            int temp = num2;
            num2 = num % num2;
            num = temp;
        }
        return num;
    }
}

public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter 1 - ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println("Enter 2 - ");
        int B = sc.nextInt();
        hcfnumber num = new hcfnumber();
        int hcf = num.checkHCF(A, B);
        System.out.println("HCF - "+ hcf);
        num.checkLCM(hcf, A, B);
    }
}
