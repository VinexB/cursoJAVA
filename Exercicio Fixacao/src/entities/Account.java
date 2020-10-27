package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	// o saldo da conta s� pode ser alterado por meio de saque ou dep�sito, sendo assim 
	// n�o teremos um setBalance
	// o mesmo funciona para o setNumber
	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Conta: "
				+ number
				+ ", Proprietario da Conta: "
				+ holder 
				+ ", saldo: R$ "
				+ String.format("%.2f", balance);
	}

}
