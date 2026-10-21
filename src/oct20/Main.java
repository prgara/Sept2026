package oct20;

public class Main {
    public static void main(String[] args) {

        String s = "";
        for (int i = 0; i < 10000; i++) {
            s = s+ i + " ";
        }
//        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
//        System.out.println(sb.reverse());
        sb.replace(0,5,"Hi");
        System.out.println(sb);


        String x = "hello";
        String concat = x.concat(" world");
        System.out.println(x);
//        System.out.println(concat);


        StringBuffer sb1 = new StringBuffer();
        sb1.append("Today");
        sb1.append(" is Tuesday");
        System.out.println(sb1);
    }
}
