package exercise3;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = new Account("James");
		Account acc2 = new Account("Edward");
		Account acc3 = new Account("Tomas");
		
		System.out.println(acc1.getAccountInfo());
		System.out.println(acc2.getAccountInfo());
		System.out.println(acc3.getAccountInfo());
	}

}
