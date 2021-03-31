class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double i = (principalAmount*time*interestRate)/100;
        return i ;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double i = (principalAmount*(Math.pow((1+(interestRate)/100),time))) - principalAmount;
        return i ;
    }
}

public class AssignmentQ3 {
    public static void main(String[] args){
        SiCi sici = new SiCi();
        System.out.println(sici.simpleInterest(9000, 3, 6));
        System.out.println(sici.compoundInterest(15000,5,3));
    }
    
}