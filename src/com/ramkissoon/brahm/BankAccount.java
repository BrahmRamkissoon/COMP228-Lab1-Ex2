package com.ramkissoon.brahm;

import javax.swing.JOptionPane;

public class BankAccount {
	
	// PRIVATE INSTANCE VARIABLES+++++++++++++++++
	private int _accountNumber;
	private String _name;
	private double _balance;
	
	// DEFAULT CONSTRUCTOR+++++++++++++++++++++++++
	public BankAccount(){
		
	}
	
	// MULTI-ARGUMENT CONSTRUCTOR++++++++++++++++++
	public BankAccount(int accountNum, String name, double balance) {
		this._accountNumber = accountNum;
		this._name = name;
		this._balance = balance;
	}

	// GETTERS AND SETTERS++++++++++++++++++++++++
	public int getAccountNumber() {
		return _accountNumber;
	}

	public void setAccountNumber(int _accountNumber) {
		this._accountNumber = _accountNumber;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}
	
	// READ-ONLY
	public double getBalance() {
		return _balance;
	}

		
	// method for deposit, check that deposit is greater than 0
	public void deposit (double depositAmount){
		if (depositAmount > 0.0){
		_balance  += depositAmount;
		}
	}
			
	// method for withdrawal, optional to check if balance 
	public void withdraw ( double withdrawAmount){
		if (withdrawAmount > 0.0 && withdrawAmount <= _balance){
			_balance -= withdrawAmount;
		}
	}
			
	public void GetAccountInfo(){ 
		JOptionPane.showMessageDialog(null, 
				"++Account Information++" +
				"\nAccount #: " + getAccountNumber() +
				"\nName: " + getName() +
				"\nBalance: $" + getBalance(), 
				"\nAccount Info", JOptionPane.PLAIN_MESSAGE);	
	}	
	
}

