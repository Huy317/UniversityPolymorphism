import java.util.Scanner;

public class CollegeStudent extends Student {
    private double graduationExamScore;

    public CollegeStudent(String studentNumber, String fullName, int totalCredit, double avgScore, double graduationExamScore) {
        super(studentNumber, fullName, totalCredit, avgScore);
        this.graduationExamScore = graduationExamScore;
    }

    public CollegeStudent(double graduationExamScore) {
        this.graduationExamScore = graduationExamScore;
    }
    public CollegeStudent() {

    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter graduation exam score: ");
        graduationExamScore = sc.nextDouble();
    }
    @Override
    public boolean isGraduate(){
        if (super.totalCredit >= 100 && super.avgScore >=5 && graduationExamScore >= 5){
            return true;
        }
        return  false;
    }
}