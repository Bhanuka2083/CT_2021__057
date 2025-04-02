package LW_03.Q5;

public class Main {
    public static void main(String[] args) {

        String courseCode = "CTEC 22043";
        String courseName = "Object Oriented Programming";
        String lecName = "Mr. Kesavan S.";
        String studentName = "Thennakoon";
        String degreeName = "BICT";



        Lecturer lecturer01 = new Lecturer(lecName,courseName) ;

        Course course01 = new Course(courseName , courseCode);
        course01.setLecturer(lecturer01);

        Student student01 = new Student(studentName,degreeName,courseName);

        System.out.println("COURSE DETAILS...");
        System.out.println(course01.getCourseCode() +' ' + course01.getCourseName() + "Teach by "+course01.getLecturer());

        System.out.println("");

        System.out.println("LECTURER DETAILS...");
        System.out.println("Lecturer "+lecturer01.getLecturerName() + " is teaching "+lecturer01.getCourseTeaching());


        System.out.println("");

        System.out.println("STUDENT DETAILS...");
        System.out.println(student01.getStudentName() + " is following " + student01.getCourseFollowing() + " for " + student01.getDegreeName());




    }

}
