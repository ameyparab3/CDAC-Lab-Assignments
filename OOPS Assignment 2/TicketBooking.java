class Ticket{
	String passengerName; int ticketNo=5001; static int count=5001;
	
	Ticket(String passengerName){
		this.passengerName=passengerName;
		this.ticketNo=count;
		count++;
	}
	
	void displayTicket(){
		System.out.println("Ticket No: "+ticketNo+", Passenger: "+passengerName);
	}
}
public class TicketBooking{
public static void main(String argz[]){
	Ticket t1 = new Ticket("Rahul");
	Ticket t2 = new Ticket("Priya");
	Ticket t3 = new Ticket("Amit");
	
	t1.displayTicket();
	t2.displayTicket();
	t3.displayTicket();
}
}
