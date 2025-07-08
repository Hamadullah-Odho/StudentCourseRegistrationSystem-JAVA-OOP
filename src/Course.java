public class Course {

    private Course(){}
    final static String[] courses = {"Introduction to Programming", "Data Structures",
                        "Object Oriented Programming (OOP)","Database Management Systems (DBMS)"
                        ,"Web Development Basics"};
    final static String[] codes = {"CS101","CS102","CS103","CS104","CS105"};

    public static void displayCourses(){
        System.out.println("---- Available Courses ----\n");
        int codecount = 0;
        for(String c : courses){

            System.out.println(codecount + " " + codes[codecount] + " > " + c);
            codecount++;

        }
        System.out.println();
    }

}
