package classpart;

public class Student {
    //멤버 변수
    int studentId;
    String studentName;
    int grade;
    String address;

//    public void showStudentInfo() {
//        System.out.println(studentName + ", " +address);
//    }
    // 메서드
    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args){
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }

}
