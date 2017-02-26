package session4d;

		// parent class of classa with super method to access test method of classc
		//use of inheritence
public class Classb extends Classc {
	public void test() {
		super.test();
		System.out.println("i am from class b");

	}
}