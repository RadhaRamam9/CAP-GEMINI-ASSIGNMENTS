class ResultDeclaration {
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        if((subject1Marks + subject2Marks + subject3Marks)>60){
            if(subject1Marks >60|| subject2Marks >60|| subject3Marks>60){
                return "failed";
            }
            else{
                if((subject1Marks + subject2Marks)>60 || (subject2Marks+subject3Marks)>60 || (subject1Marks+subject3Marks)>60){
                    return "passed\n promoted";
                }
                else{
                    return "passed";
                }
            }
        }
        else{
        return "failed";
        }
    }
}

public class AssignmentQ4 {
    public static void main(String[] args)
    {
        ResultDeclaration r = new ResultDeclaration();
        System.out.println(r.declareResults(10,10,10));
        System.out.println(r.declareResults(70,10,10));
        System.out.println(r.declareResults(10,20,40));
        System.out.println(r.declareResults(10,30,40));
    }
}