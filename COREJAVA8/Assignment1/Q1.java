import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int sum=0,n = num;
        while(num>0) {
            int temp = num%10;
            sum = sum + (temp*temp*temp);
            num = num/10;
        };
        if(sum == n) {
            return true;
        }
        return false;
    }
}

public class Assignment1Q1 {
    public static void main(String[] args) {
    	System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArmstrongOrNot check = new ArmstrongOrNot();
        boolean res = check.armstrongCheck(num);
        System.out.println(res);
        scan.close();
    }
}