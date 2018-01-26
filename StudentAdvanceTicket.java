
public class StudentAdvanceTicket extends AdvanceTicket {
	private String school;

	public StudentAdvanceTicket(int _number, int _days, String _school) {
		super(_number, _days);
		school = _school;
	}

	public double getPrice() {
		return 0.7 * super.getPrice();
	}

	public String toString() {
		return "Number: " + getTicketNum() + ", Price: " + getPrice() + ", School: " + school;
	}
}
