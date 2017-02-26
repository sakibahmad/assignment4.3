/* program to access method of classc from classa by 
 * SUPER method
 * */
package session4d;
		//applying inheritence

public class Classa extends Classb {
	public void test() {
		// calling super method
		super.test();
		System.out.println("i am from class a");
	}

	public static void main(String[] args) {
		Classa obj = new Classa();
		obj.test();
	}

}
/*
 * we can access method of classc to from classa by super.test() method IN CASE
 * WE HAVE SAME METHOD IN EVERY CLASS FROM PARENT TO CHILD WE NEED TO
 * EXPLICITELY PASS SUPER METHOD TO ITS DECENDED PARENT EACH TIME
 */