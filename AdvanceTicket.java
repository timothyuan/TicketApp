
public class AdvanceTicket implements Ticket {
	private 	int ticketNumber;
	private int days;

   
   public AdvanceTicket(int _number, int _days) {
      ticketNumber = _number;
      days = _days;
	   
   }
   
   public double getPrice() {
	   if(days>=10) {
		   return 20;
	   }else {
		   return 30;
	   }
   }

   public int getDays() { 
	   return days;
   }
   public int getTicketNum() {
	   return ticketNumber;
   }
   public String toString() {
	   return "Number: " + getTicketNum() + ", Price: " + getPrice();
   }
}
