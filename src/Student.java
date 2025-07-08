public class Student extends User{

    private String[] courses = new String[2];
    int coursecount = 0;

    //setters
    public void setName(String name){this.name = name;}
    public void setFatherName(String fathername){this.fathername = fathername;}
    public void setRollno(int rollno){this.rollno = rollno;}
    public void setAge(int age) {
            this.age = age;
    }

    //getters
    public String getName(){ return name;}
    public String getFatherName(){return fathername;}
    public int getAge(){return age;}
    public int getRollno(){return rollno;}

    //show student details

    public void displayDetails(){
        System.out.println("Student Name : " + getName());
        System.out.println("Father Name : " + getFatherName());
        System.out.println("Age : " + getAge());
        System.out.println("Roll No :" + getRollno());
        System.out.println("\n ---- Enrolled Course ----\n");
        boolean empty = true;
        for(String c : courses){
            if(c != null){
                System.out.println(c);
                empty = false;
            }
        }
        if(empty){
            System.out.println("Not Enrolled in Course");
        }

    }

    // enroll in course method

    public boolean enrollCourse(String course){
        if(coursecount == 2){
            return false;
        }
        else {
            courses[coursecount] = course;
            coursecount++;
            return true;
        }
    }


}
