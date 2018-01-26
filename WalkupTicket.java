
public class WalkupTicket implements Ticket {
	private int ticketNumber;

	public WalkupTicket(int _number) {
		ticketNumber = _number;
	}

	public double getPrice() {
		 return 50;
	  }

	public int getTicketNum() {
		return ticketNumber;
	}

	public String toString() {
		return "Number: " + getTicketNum() + ", Price: " + getPrice();
	}
}
