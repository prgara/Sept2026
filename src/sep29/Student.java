package sep29;

public class Student {
   String name;
   int rollNo;
   double marks;

   // can study
    void study(){
        System.out.println(name + " is studying");
    }

    void displayInfo(){
        System.out.println("Student name is : "+ name +
                " and roll no is :" + rollNo + " with marks : "+ marks  );
    }
}


