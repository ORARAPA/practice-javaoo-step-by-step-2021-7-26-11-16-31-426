package practice05;

public class Teacher extends Person {
    public int klass;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Teacher(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        String statement = super.introduce() + " I am a Teacher.";
        if(this.klass == 0){
            return statement + " I teach No Class.";
        }
        return statement + " I teach Class " + this.klass + ".";

    }
}
