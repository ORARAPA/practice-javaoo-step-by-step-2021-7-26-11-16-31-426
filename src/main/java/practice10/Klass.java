package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Object leader;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

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
            if(teacher!=null){
                System.out.printf("I am %s. I know %s become Leader of %s.\n",teacher.getName(),student.getName(),getDisplayName());
            }
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        students.add(student);
        if(teacher!=null) {
            System.out.printf("I am %s. I know %s has joined %s.\n",teacher.getName(),student.getName(),getDisplayName());
        }
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

