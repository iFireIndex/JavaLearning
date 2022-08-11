package cf.indexfoundation.www;

class numberOfStudents <ParamType>{     //Here the data type is Generic, so that I can set the data type after in the main class
    ParamType students;     //This is the variable with no primitive data type, but 'ParamType' means I can set data type of the variable later

    public numberOfStudents(ParamType students) {       //A constructor with the argument of 'students', but the data type of the variable 'students' is not initially define
        this.students = students;
    }

    //Below are the getter and setter
    public ParamType getStudents() {
        return students;
    }
    public void setStudents(ParamType students) {
        this.students = students;
    }
}

public class generics {
    public static void main(String[] args) {
        numberOfStudents<Integer> student1 = new numberOfStudents<Integer>(10);
        System.out.println("Initial number of students are: " +student1.getStudents());

        student1.setStudents(16);
        System.out.println("Final students are: " + student1.getStudents());
    }
}