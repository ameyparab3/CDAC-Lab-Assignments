class Product{
    int id; String name; double price;
    Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

abstract class CartItem extends Product{
    CartItem(int id, java.lang.String name, double price) {
        super(id, name, price);
    }
    abstract void calculateTotalPrice();
}

interface Discountable{
    void applyDiscount();
}

class Cart extends CartItem implements Discountable{
    static double totalPrice; static int counter;
    Cart(int id, String name, double price){
        super(id, name, price);
        calculateTotalPrice();
    }
    void calculateTotalPrice(){
        totalPrice=totalPrice+this.price;
    }
    public void applyDiscount(int percent){
        this.price=this.price*(100-percent)/100;
        counter++;
    }

    static void showTotalCost(){
        System.out.println("Total Cart Price = "+totalPrice);
    }
}

public class OnlineShopping2 {
    public static void main(String argz[]){
    Cart p1 = new Cart(1, "Laptop", 50000);
    Cart p2 = new Cart(2, "Mouse", 500);
    Cart p3 = new Cart(3, "Keyboard", 1200);
    Cart.showTotalCost();
    }
}
