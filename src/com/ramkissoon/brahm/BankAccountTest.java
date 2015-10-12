package com.ramkissoon.brahm;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		String accountNum = JOptionPane.showInputDialog("Please enter your Account Number, (example 975): ");
		bankAccount.setAccountNumber(Integer.parseInt(accountNum));
		
		String name = JOptionPane.showInputDialog("Please enter your name: ");
		bankAccount.setName(name);
		
		String deposit = JOptionPane.showInputDialog("Please make a deposit: ");
		bankAccount.deposit(Integer.parseInt(deposit));
		
		String withdraw = JOptionPane.showInputDialog("Please make a withdrawal: ");
		bankAccount.withdraw(Integer.parseInt(withdraw));
		
		JOptionPane.showMessageDialog(null, "Thank you! \nClick OK to view your account information", "", JOptionPane.INFORMATION_MESSAGE);
		
		bankAccount.GetAccountInfo();

	}

}
