package nov14;

import java.util.LinkedList;

public final class Teacher {

   private final String name;
    private final String dept;
    private final double salary;


    public Teacher(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
