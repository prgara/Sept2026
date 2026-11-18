package nov14;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Raj","CS",2000);
        System.out.println(teacher.toString());
        System.out.println(teacher);


        List<String> list = new ArrayList<>();
        list.add("Raj");
        list.add("Pooja");
        list.add("Tom");
        list.add("harry");
        list.add("Daniel");
        list.add("Tom");
        list.add("Tom");
        list.add("Tom");
        list.add("Tom");
        list.add("Tom");
        list.add("Tom");
        System.out.println(list.size());
        System.out.println(list.get(2));
//        System.out.println(list);
        list.add(1,"Rahul");
        System.out.println(list);
        System.out.println(list.contains("tom"));
        System.out.println(list.getLast());
        list.set(1,"Riya");
        System.out.println(list);
        list.get(1);





        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Canada");
        countries.add("Japan");
        countries.add("Afghanistan");

        List<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("Toronto");
        cities.add("Vancouver");


        // India, tokyo,Tornoto,Vancouver, Canada,japan,Afghanistan

        countries.addAll(1,cities);

//        countries.add(1,cities.get(0));
//        countries.add(2,cities.get(1));
//        countries.add(3,cities.get(2));

        System.out.println(countries);

        System.out.println("Before removing "+list);

        for (String ele : list){
            if (ele.equals("Pooja")){
//                list.remove("Pooja");
            }
        }
        System.out.println("After removing "+list);
        System.out.println();

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("Pooja")){
//                list.remove("Pooja");
//            }
//        }



        List<String> fruits = List.of("Apple", "Banana", "Mango", "Kiwi", "Cherry");
        Iterator<String> iterator = fruits.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        System.out.println(nums);
        System.out.println(nums.get(10000));


        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Mujatba","CS",1000000));
        teachers.add(new Teacher("Deepak","IT",100000));
        teachers.add(new Teacher("Amit","Elect",500000));
        teachers.add(new Teacher("Neera","CS",600000));



    }
}
