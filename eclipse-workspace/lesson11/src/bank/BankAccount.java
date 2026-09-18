package bank;

public class BankAccount {
	private double balance;
	private String name;
	
	BankAccount(String name) {
		this.balance = 0;
		this.name = name;
	}
	
	void displayBalance() {
		System.out.printf("Balance: %.2f\n", this.balance);
	}
	
	class InvalidAccountRequestException extends Exception {
		InvalidAccountRequestException(String msg) {
			super(msg);
		}
	}
	
	void depositFunds(double deposit) throws InvalidAccountRequestException {
		if (deposit < 0)
			throw new InvalidAccountRequestException("Negative deposit!");
		this.balance += deposit;
	}

	void withdrawFunds(double request) throws InvalidAccountRequestException {
		if (request > this.balance)
			throw new InvalidAccountRequestException("Excessive withdrawal!");
		this.balance -= request;
	}
	   public void main(String[] args) {
	   name = "Sebastian";
	   balance= 5;
	   }}
