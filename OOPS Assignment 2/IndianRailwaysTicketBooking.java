class Passenger{
    String name, seatType="General";
    int age;
    static int counter;
    Passenger(String name, int age){
        this.name=name;
        this.age=age;
        counter++;
    }
    Passenger(String name, int age, String seatType){
        this.name=name;
        this.age=age;
        this.seatType=seatType;
        counter++;
    }

}

public class IndianRailwaysTicketBooking {
    public static void main(String argz[]){
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p3 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");

        System.out.println("Passenger1: "+"Name: "+p1.name+", Age: "+p1.age+", Seat: "+p1.seatType);
        System.out.println("Passenger1: "+"Name: "+p2.name+", Age: "+p2.age+", Seat: "+p2.seatType);
        System.out.println("Passenger1: "+"Name: "+p3.name+", Age: "+p3.age+", Seat: "+p3.seatType);

        System.out.println("Total Passengers Booked: "+Passenger.counter);
    }
}
