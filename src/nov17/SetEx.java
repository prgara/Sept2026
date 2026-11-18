package nov17;

import nov10.Student;

import java.util.*;

public class SetEx {

    public static void main(String[] args) {
        Set<String> ids = new HashSet<>();

        ids.add("user_171"); // convert this element into a code using hashcode method.   456 --- 4
        ids.add("user_11"); // 5
        ids.add("user_123");
        ids.add("user_1234");
        ids.add("user_1");
        ids.add("user_1234");
        System.out.println(ids.size());
        System.out.println(ids);
        System.out.println(ids.contains("user_111"));


        for (String id : ids){
            System.out.println(id);
        }


        Set<Integer> nums = new TreeSet<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(1);

        System.out.println(nums);


        List<Integer> list = Arrays.asList(1, 2, 3, 5, 5, 6, 3, 4, 7, 7, 5, 4);
        System.out.println("Original List: " +list);
        Set<Integer> uniqueNums = new HashSet<>(list);
        System.out.println(uniqueNums);

        Employee raj = new Employee("Raj", "98786767777","raj@gmail.com");
        Employee sham = new Employee("Sham", "8789787989","sham@gmail.com");
        Employee tom = new Employee("Tom", "63487388","tom@gmail.com");

        List<Employee> employees = new ArrayList<>();
        employees.add(raj);
        employees.add(tom);
        employees.add(tom);
        System.out.println(employees);

        Set<Employee> uniqueEmplyees = new HashSet<>(employees);
        System.out.println(uniqueEmplyees);


    }
}
