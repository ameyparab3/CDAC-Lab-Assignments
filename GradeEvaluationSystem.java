public class GradeEvaluationSystem {
    public static void main(String argz[]){
        int Maths = 30;
        int Science = 30;
        int History = 30;
        float avg = ((Maths + Science + History)/3);
        if (avg>=90) {
            System.out.println("Grade A");
        }
        else if(70<=avg && avg<=89){
            System.out.println("Grade B");
        }
        else if(50<=avg && avg<=69){
            System.out.println("Grade C");
        }
        else if(30<=avg && avg<=49){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
