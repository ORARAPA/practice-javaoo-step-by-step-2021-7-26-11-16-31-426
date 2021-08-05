package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Object leader; //Student
    private List<Student> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public Object getLeader() {
        return leader;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if(students.contains(student)){
            this.leader = student;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        students.add(student);
    }


}

