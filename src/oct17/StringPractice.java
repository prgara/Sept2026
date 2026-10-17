package oct17;

public class StringPractice {

    public static void main(String[] args) {
        String s = "Hello"; // string literal

        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String world = s.concat(" World");
        String lowerCase = s.toLowerCase();
        System.out.println(world);
        System.out.println(s.indexOf('e'));
        System.out.println(s.concat("10"));
        System.out.println(s);

        String kitten = "Kitten is playing";
        String[] s1 = kitten.split(" ");
        for (String ele: s1){
            System.out.println(ele);
        }

        String a = "Hello";
        String b = new String("Hello");

        System.out.println(s == a);
        System.out.println(s == b);
        System.out.println("=========================");
        System.out.println(a.equals(s));
        System.out.println(b.equals(s));
        String g = "           Trimming words     ";
        System.out.println(g);
        System.out.println(s.trim());
        System.out.println(g.strip());


    }
}
