package sep19;

public class DecisionMaking {

    public static void main(String[] args) {
        // if raining i will carry umbrella
        boolean isRaining = false;
        boolean isSunny = true;
        boolean isSnowing = true;
        boolean isRainingHeavily = true;
        int a = 11;
//        if (a == 10 ) {
//            System.out.println("A is equal to 10");
//        } else {
//            System.out.println("A is not equals to 10");
//        }


        if(isRaining){
            if(isRainingHeavily){
                System.out.println("I will wear rain coat");
            } else {
                System.out.println("xbsjdhejw");
            }
            System.out.println("I will carry umbrella");
        } else if(isSunny){
            System.out.println("I will carry sunglasses");
        } else if(isSnowing) {
            System.out.println(" I will wear jacket");
        } else {
            System.out.println("I will do nothing.");
        }

    }
}
