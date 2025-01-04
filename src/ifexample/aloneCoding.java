package ifexample;

public class aloneCoding {
    public static void main(String[] args) {
        int score = 59;
        char grade;

        if (90 <= score && score <= 100){
            grade = 'A';
            System.out.println(grade);
        }
        else if (89 >= score && score >= 80){
            grade = 'B';
            System.out.println(grade);
        }
        else if (79 >= score && score >= 70){
            grade = 'C';
            System.out.println(grade);
        }
        else if (69 >= score && score >= 60){
            grade = 'D';
            System.out.println(grade);
        }
        else {
            grade = 'F';
            System.out.println(grade);
        }
    }
}
