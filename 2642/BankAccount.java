package com.htc.corejava.exercise;

public class BankAccount {

	String accountNo;
	String accountName;
	double balance;
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
	BankAccount b = new BankAccount("XXIK00001","John Doe");
	b.setBalance(1000);

	}
	
}
