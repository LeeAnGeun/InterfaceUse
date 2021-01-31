package cls;

import inf.PrintNameInterface;

public class NameCard {
	String name;
	String phone;
	String email;

	// interface
	PrintNameInterface printNameCard;
	
	public NameCard() {
		this("","","");
	}
	public NameCard(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(PrintNameInterface p) {
		printNameCard = p;
	}
	
	public void print() {
		printNameCard.print(this);
	}
}
