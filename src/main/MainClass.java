package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhone;
import cls.PrintNamePhoneEmail;
import inf.PrintNameInterface;

public class MainClass {

	public static void main(String[] args) {
		
		NameCard ncard = new NameCard("성길이", "123-4567", "awe@naver.com");
		
		ncard.setPrintNameCard(new PrintNameCard()); 
		ncard.print();
		
		ncard.setPrintNameCard(new PrintNamePhone());
		ncard.print();
		
		ncard.setPrintNameCard(new PrintNamePhoneEmail());
		ncard.print();
		
		
		NameCard ncardArr[] = new NameCard[3];
		ncardArr[0] = new NameCard("aaa", "aaa", "aaa");
		ncardArr[1] = new NameCard("bbb", "bbb", "bbb");
		ncardArr[2] = new NameCard("ccc", "ccc", "ccc");
		
		ncardArr[0].setPrintNameCard(new PrintNameCard());
		ncardArr[1].setPrintNameCard(new PrintNamePhone());
		ncardArr[2].setPrintNameCard(new PrintNamePhoneEmail());
		
		PrintNameInterface nf[] = new PrintNameInterface[3];
		nf[0] = new PrintNameCard();
		nf[1] = new PrintNamePhone();
		nf[2] = new PrintNamePhoneEmail();
		
		ncardArr[0].setPrintNameCard(nf[0]);
		ncardArr[1].setPrintNameCard(nf[1]);
		ncardArr[2].setPrintNameCard(nf[2]);
		
		for (int i = 0; i < nf.length; i++) {
			if(nf[i] instanceof PrintNamePhoneEmail)
				ncardArr[i].print();
		}
		
	}

}
