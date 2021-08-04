package practice07;

public class Klass {
    private int number;
    private Object leader;

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

    public Object assignLeader(Student student) {
        leader = student;
        return leader;
    }


}
