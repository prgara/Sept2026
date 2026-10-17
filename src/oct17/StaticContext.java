package oct17;

public class StaticContext {


  static   int x = 10;

  static void display(){
       System.out.println(x);
   }


    public static void main(String[] args) {
        char[] arr = new char[5];
        arr[0] = 'H';
        arr[1] = 'E';
        arr[2] = 'L';
        arr[3] = 'L';
        arr[4] = 'O';

        for (char ele: arr){
            System.out.print(ele);
        }

        System.out.println();
        String s = "Hello world !!";
        System.out.println(s);
    }


}
