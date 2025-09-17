abstract class Payment{
    abstract void pay();
}

class CreditCardPayment extends Payment{
    int cardNumber; double amount;
    CreditCardPayment(int cardNumber, double amount){
        this.cardNumber=cardNumber;
        this.amount=amount;
    }
    void pay(){
        System.out.println("Payment via Credit Card "+this.cardNumber+" -> Rs. "+this.amount+" Paid");
    }
}

class UPI extends Payment{
    String upiId; double amount;
    UPI(String upiId, double amount){
        this.upiId=upiId;
        this.amount=amount;
    }
    void pay(){
        System.out.println("Payment via UPI "+this.upiId+" -> Rs. "+this.amount+" Paid");
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment c1 = new CreditCardPayment(1234567, 5000);
        UPI u1 = new UPI("rahul@upi", 2000);
        c1.pay();
        u1.pay();
    }
}
