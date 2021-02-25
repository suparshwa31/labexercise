class Account {
int accno;
String name;
double balance;

void deposit(double amount) {
balance = balance + amount;
}

void withdraw(double amount) {
balance = balance + amount;
}
}

class AccountDemo {
	public static void main(String[] args) {
		
		Account myAcc = new Account();
		myAcc.accno = 101;
		myAcc.name = "Raj";
		myAcc.balance = 50000;
		
		myAcc.deposit(10000);

		System.out.println("Final balance:" + myAcc.balance);
}
}