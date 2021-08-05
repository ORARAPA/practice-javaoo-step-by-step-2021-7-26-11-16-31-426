package practice09;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    public Klass klass;
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }

    public Teacher(int id, String name, int age, LinkedList classes) {
        super(id,name,age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        String classes = ""; //rename

        for (int i = 0; i < this.classes.size();i++){
            classes += this.classes.get(i).getNumber();
            if((this.classes.size() - i) != 1){
                classes += ", ";
            }
        } //use stream api

        String statement = super.introduce() + " I am a Teacher.";
        if(this.classes.size() == 0){
            return statement + " I teach No Class.";
        }
        return statement + " I teach Class " + classes + ".";

    }

    public String introduceWith(Student student) {
        String statement = super.introduce() + " I am a Teacher.";
        for (int i = 0; i < this.classes.size() ; i++) {
            if(this.classes.get(i).getNumber() == student.getKlass().getNumber()){
                return  statement + " I teach Jerry.";
            }
        }
//        if(this.classes.contains(student.getKlass().getNumber())){
//            return  statement + " I teach Jerry.";
//        }

        return  statement + " I don't teach Jerry.";
    }

    public boolean isTeaching(Student student){
        return this.classes.contains(student.getKlass());
    }

}

