package org.n3r.idworker;

public class Test {

	public static void main(String[] args) {
		Sid sid=new Sid();
		for (int i = 0 ; i < 10 ; i ++) {
			System.out.println(sid.nextShort());
		}
	}

}
