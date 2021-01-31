package cls;

import inf.PrintNameInterface;

public class PrintNamePhoneEmail implements PrintNameInterface {

	@Override
	public void print(NameCard nc) {
		System.out.println("이름 : " + nc.name);
		System.out.println("전화번호 : " + nc.phone);
		System.out.println("e-mail : " + nc.email);
	}

}
