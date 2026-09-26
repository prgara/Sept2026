package sep26;

public class Main {

    public static void main(String[] args) {
        // 10 - 1 using for loop

        for ( int i=10;i >=1; i--){ // 11 ,   11<=10 , execute the body , 11
//            System.out.println(i);
        }

        // print even nums using for loop

        for (int j = 1; j <=10; j+=2) {
            System.out.println(j);
        }

        /*
        take input
        put in a loop , condition --> num is 1, decrement by 1
        decalre a var and assign a val as 1 and put that num there by multiply
        3X1 = 3
        2X3 =6
        1X6 =6

         */

        int num = 234;
        int sum =0;
        while (num > 0){
            sum += num%10;
            num = num/10;

        }
        System.out.println(sum);

        /*
        234 ==== 4, 3, 2
        sum = 4+3+2
        234%10 = 4
        234/10 =23
        module by 10 --- 23%10 = 3
        division by 10 = 23/10 = 2
        2%10

         */

    }
}
