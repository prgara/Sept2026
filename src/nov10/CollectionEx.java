package nov10;

import java.util.ArrayList;

public class CollectionEx {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Raj",9));
        students.add(new Student("Tom",10));
        System.out.println(students);

        Container<String,Integer> container = new Container<>("Table",90);
        Container<Integer,Boolean> container2 = new Container<>(90,false);
        System.out.println(container);






        // avg or median or mean
        // avg on list
    }
}
