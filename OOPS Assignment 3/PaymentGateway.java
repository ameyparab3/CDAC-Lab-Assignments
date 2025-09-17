import java.util.Scanner;
interface Payment{
    void pay();
}

class CreditCardPayment implements Payment{
    int payment;
    CreditCardPayment(int payment){
        this.payment=payment;
    }
    public void pay(){
        System.out.println("Processing Credit Card Payment of "+this.payment);
    }
}

class PayPalPayment implements Payment{
    int payment;
    PayPalPayment(int payment){
        this.payment=payment;
    }
    public void pay(){
        System.out.println("Processing PayPal Payment of "+this.payment);
    }
}

class PaymentGateway{
    public static void main(String argz[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CreditCardPayment c1 = new CreditCardPayment(num);
        num = sc.nextInt();
        PayPalPayment p1 = new PayPalPayment(num);
        c1.pay();
        p1.pay();
    }
}