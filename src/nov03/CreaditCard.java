package nov03;

public class CreaditCard implements Payable{


    @Override
    public void pay() {
        System.out.println("Pay using credit card");
    }
}
