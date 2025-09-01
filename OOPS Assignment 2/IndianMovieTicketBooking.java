class Customer{
    String name, ticketType="Normal";
    static int counter;

    Customer(String name){
        this.name=name;
        counter++;
    }
    Customer(String name, String ticketType){
        this.name=name;
        this.ticketType=ticketType;
        counter++;
    }
}

public class IndianMovieTicketBooking {
    public static void main(String argz[]){
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja","Premium");
        Customer c3= new Customer("Amit");

        System.out.println("Customer1: Name: "+c1.name+", Ticket: "+c1.ticketType);
        System.out.println("Customer2: Name: "+c2.name+", Ticket: "+c2.ticketType);
        System.out.println("Customer3: Name: "+c3.name+", Ticket: "+c3.ticketType);

        System.out.println("Total Tickets Sold: "+Customer.counter);
    }
}
