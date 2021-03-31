class TaxAmount {
    public double calculateTaxAmount(int ctc){
        double tax = 0.0;
        if(ctc>=0 && ctc<=180000){
            tax = 0.0;
        }else if(ctc>=180001 && ctc<=300000){
            tax = (ctc*(10.0/100));
        }else if(ctc>=300001 && ctc<=500000){
            tax = (ctc*(20.0/100));
        }else if(ctc>=500001 && ctc<=1000000){
            tax = (ctc*(30.0/100));
        }

        return tax;
    }
}

public class AssignmentQ5 {
    public static void main(String[] args){
        TaxAmount t = new TaxAmount();
        System.out.println(t.calculateTaxAmount(360000));
    }
}