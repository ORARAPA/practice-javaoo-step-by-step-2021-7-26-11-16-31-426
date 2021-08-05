package practice07;

public class Student extends Person {
    public Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        String statement =  super.introduce() + " I am a Student. ";
        if(getKlass().getLeader() == null){
            return statement + "I am at Class " + this.klass.getNumber() + ".";
        }
        return statement + "I am Leader of Class " + this.klass.getNumber() + "."; //refactor
    }
}
