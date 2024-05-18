import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n != 8){
            System.out.println("1.add new college student");
            System.out.println("2.add new university student");
            System.out.println("3.remove student by code");
            System.out.println("4.print list");
            System.out.println("5.print eligible for graduation");
            System.out.println("6.sort list");
            System.out.println("7.Find student by full name");
            System.out.println("8.Exit");
            n = sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:
                    Student collegeStudent = new CollegeStudent();
                    collegeStudent.input();
                    break;
                case 2:
                    Student uniStudent = new UniversityStudent();
                    uniStudent.input();
            }

        }
    }
}