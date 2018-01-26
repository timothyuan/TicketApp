public class myApp {

	public static void main(String[] args) {
		
	  Ticket t1 = new WalkupTicket(111);
	  
	  Ticket t2 = new AdvanceTicket(22, 11);
	  Ticket t3 = new AdvanceTicket(34, 5);
	  Ticket t4 = new StudentAdvanceTicket(68, 11, "Leland");
	  
	  System.out.println("t1: " + t1);
	  System.out.println("t2: " + t2);
	  System.out.println("t3: " + t3);
	  System.out.println("t4: " + t4);
	  
	  TicketPurchaseRecord pList = new TicketPurchaseRecord();
	  pList.addTicket(t1);
	  pList.addTicket(t2);
	  pList.addTicket(t3);
	  pList.addTicket(t4);
	  double price = pList.totalPrice(); 
	  System.out.println("I have to pay: " + price);
	  
	  pList.removeTicket(t3);
	  price = pList.totalPrice(); 
	  System.out.println("Removing one ticket, now I pay: " + price);
	}

}
