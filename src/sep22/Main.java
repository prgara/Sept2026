package sep22;

public class Main {

    public static void main(String[] args) {
        // if flag is not true i will print "Today is not the day"
        boolean flag = false;
        if (!flag){
            System.out.println("Today is not the day");
        }

        int count = 0; //0
        while (count <= 5){ // 1<=10, true, 0<=10,true
            System.out.println(count); // 1,0
            count++; //0
        }
        //0-5...

        int x = 1;
        do {
            System.out.println("Hi");
            x++;
        } while (x > 5);



    }}
