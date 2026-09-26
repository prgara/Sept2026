package sep22;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if((i ==5 )){ // 1%2 == 0
                continue; // skipping the current iteration
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if((i==5)){ // 1%2 ==0
                break; // come out of the loop
            }
            System.out.println(i);

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
}
