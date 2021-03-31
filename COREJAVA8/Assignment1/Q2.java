import java.util.ArrayList;
import java.util.List;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        int num,i,temp,n,sum;
        List<Integer> in = new ArrayList<>();
        for(i=min;i<=max;i++){
            num=i;
            n = num;sum=0;
            while(num>0){
                temp = num%10;
                num = num/10;
                sum = sum + temp*temp*temp;
            }
            if(sum==n){
                in.add(sum);
            }
        }
        /**
         * printing out the list
         */
        System.out.println(in);
        return new int[0];
    }
}
public class Assignment1Q2 {
    public static void main (String [] args) {
        int min = 100;int max = 999;
        ArmstrongNumBetweenRange arm = new ArmstrongNumBetweenRange();
        arm.armstrongNumbersInRange(min,max);
    }
}