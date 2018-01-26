import java.util.*;
public class TicketPurchaseRecord {
     private ArrayList<Ticket> purchase; 

     public TicketPurchaseRecord() {
    	 	purchase = new ArrayList<Ticket>();
     }
     
     public void addTicket(Ticket t) {
    	 	purchase.add(t);
     }
     
     public void removeTicket(Ticket t) {
    	  	purchase.remove(t);
     }
     
     public double totalPrice() {  // calculate the total price of all tickets
    	 double total = 0;	
    	 for(Ticket t:purchase) {
    	 		total += t.getPrice();
    	 	}
    	 return total;
     }
     
}
