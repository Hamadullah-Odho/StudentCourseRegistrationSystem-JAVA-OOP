import java.util.*;
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        SystemManager manager = new SystemManager();

        boolean run = true;

        while(run){

            System.out.println("----- Student Course Registration System -----\n");
            System.out.println("> Student Portal");
            System.out.println("1. Register New Student");
            System.out.println("2. Enroll Student in a Course\n");
            System.out.println("> Admin Portal (Login Required)");
            System.out.println("3. View All Courses");
            System.out.println("4. View All Student");
            System.out.println("5. View Student Details by Roll Number\n");
            System.out.println("6. Exit\n");
            System.out.println("===============================================");

            try{
                System.out.print("Enter Selection : ");
                int select = Integer.parseInt(scan.nextLine());
                System.out.println();
                if(select >= 3 && select <=5){
                    boolean getlogin = manager.adminLogin();
                    if(!getlogin){
                        System.out.println("---- Access Denied ----\n");
                        continue;
                    }

                }
                switch (select){
                    case 1:
                        manager.enrollStudent();
                        break;
                    case 2:
                        manager.addCourse();
                        break;
                    case 3:
                        manager.showCourses();
                        break;
                    case 4:
                        manager.showStudents();
                        break;
                    case 5:
                        manager.getStudent();
                        break;
                    case 6:
                        run = false;
                        break;
                    default:
                        System.out.println("Enter selection between (1-6)");
                }
                System.out.println();

            }
            catch (NumberFormatException e){
                System.out.println("Selection cannot be non-numeric");
            }

        }
        System.out.println("---- Program Closed ----");


    }
}
