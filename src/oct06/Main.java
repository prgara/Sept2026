package oct06;

public class Main {

    public static void main(String[] args) {
        //data type       ref/var               allocating 10 memory location
        int[]               marks    =         new int[10];
        marks[0] = 49;
        marks[1] = 48;
        marks[2] = 50;
        marks[3] = 46;
        marks[4] = 45;
        marks[5] = 48;
        marks[6] = 47;
        marks[7] = 50;
        marks[8] = 49;
        marks[9] = 50;


        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[6] = 49;
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(" //======================================================//");
        //======================================================//

        int[] scores = {85,89,99,89,98}; // array with 5 values

        scores[0] = 99;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println("Length of the scores array is: "+ scores.length);
        System.out.println("Length of the marks array is: "+ marks.length);

        System.out.println("Printing array with loops");
        for (int i = 0; i < scores.length; i++) {
           // System.out.println(scores[i]);
        }

        System.out.println("using for each loop");
       for ( int s : marks ){
           System.out.println(s);
       }






    }
}
