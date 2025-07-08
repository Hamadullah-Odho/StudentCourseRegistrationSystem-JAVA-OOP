import java.util.*;

public class SystemManager{

    Scanner scan = new Scanner(System.in);
    AdminSystem admin = new AdminSystem();
    Student[] student = new Student[100];
    int studentcount = 0;


    //method for enrolling student
    public void enrollStudent(){


        System.out.println("---- Student Enrollment Menu ----\n");
        try {
            System.out.print("Enter Student Name : ");
            String name = scan.nextLine();

            System.out.print("Enter Father Name : ");
            String fathername = scan.nextLine();

            System.out.print("Enter Age : ");
            int age = Integer.parseInt(scan.nextLine());
            System.out.print("Enter Roll No :");
            int rollno = Integer.parseInt(scan.nextLine());
            if(age >= 18 && age <= 25) {
                student[studentcount] = new Student();
                student[studentcount].setName(name);
                student[studentcount].setRollno(rollno);
                student[studentcount].setAge(age);
                student[studentcount].setFatherName(fathername);
                studentcount++;
                System.out.println("---- Student added Successfully ---- \n");
            }
            else{
                System.out.println("---- Student is not eligible (age limit 18-25) ----");
            }
        }
        catch (NumberFormatException e){
            System.out.println("---- (Age - rollno ) cannot be non numeric ----");
        }
        catch (Exception e){
            System.out.println("---- Unexpected error occurred ----");
        }
    }
    //method for showing all courses
    public void showCourses(){
        Course.displayCourses();
    }

    // method for showing all students
    public void showStudents(){
        System.out.println("---- Enrolled Students ----\n");
        int stdcount = 1;
        boolean empty = true;
        for(Student s: student){
            if(s != null) {
                System.out.println("Student :" + stdcount);
                s.displayDetails();
                empty = false;
            }
        }
        if(empty){
            System.out.println("---- Students List is Empty ---- \n");
        }
    }

    // method for showing single student details
    public void getStudent(){
        System.out.println("---- Student Details ----\n");
        System.out.print("Enter Roll No : ");
        int search = scan.nextInt();
        boolean notfound = true;
        for(Student s : student){
            if(s != null && search == s.getRollno()){
                s.displayDetails();
                notfound = false;
                break;
            }
        }
        if(notfound){
            System.out.println("---- Student Not Found ----");
        }
    }
    public void addCourse(){
        System.out.println("---- Enroll Course ----\n");
        try {
            System.out.print("Enter Student Roll No : ");
            int rollno = Integer.parseInt(scan.nextLine());
            boolean notFound = true;
            for(Student s : student){
                if(s != null && rollno == s.rollno){
                    Course.displayCourses();
                    System.out.print("Enter Course Index :");
                    int index = Integer.parseInt(scan.nextLine());

                    for(String c : Course.courses){
                        if(c.equals(Course.courses[index])){
                            boolean enrolled = s.enrollCourse(c);
                            if(enrolled){
                                System.out.println("Course Enrolled Successfully");
                            }
                            else {
                                System.out.println("Student is already enrolled in 2 courses");
                            }
                            break;
                        }
                    }
                    notFound = false;
                    break;
                }
            }
            if(notFound){
                System.out.println("---- Student Not Found ----");
            }
        }
        catch (NumberFormatException e){
            System.out.println("---- Roll no cannot be non numeric ----");
        }
    }

    //admin login method

    public boolean adminLogin(){

            System.out.println("---- Admin Login ----\n");
            System.out.print("Enter Username : ");
            String name = scan.nextLine();
            System.out.print("Enter Pin : ");
            int pin = Integer.parseInt(scan.nextLine());
            boolean Checklogin = admin.login(name,pin);
            return Checklogin;
    }
}
