package practice08;

public class Teacher extends Person {
    public Klass klass;

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        String statement = super.introduce() + " I am a Teacher.";
        if(klass == null){
            return statement + " I teach No Class.";
        }
        return statement + " I teach Class " + this.klass.getNumber() + ".";

    }

    public String introduceWith(Student student) {
        String statement = super.introduce() + " I am a Teacher.";
        if(this.klass.getNumber() == student.getKlass().getNumber()){
            return statement + " I teach " + student.getName() + ".";
        }

        return statement + " I don't teach " + student.getName() + ".";

    }

}

