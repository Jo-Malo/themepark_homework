public class Customer extends Person implements IPayment, IHeight {

    private int payment;

    public Customer(int age, int wallet, double height){
       super(age, wallet, height);
       this.payment = 4;
       this.height = 50.00;

    }

    public void payment(int price){
        wallet -= price;
    }

    public void height(double inches){
        if (height >= inches) {
            this.payment--;
        }

    }


}
