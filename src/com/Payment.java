package com;

public class Payment {
	
	//cash on Delivery
	public void pay(double amount) {
		System.out.println("Payment done with Cash on Delivary. Amount :" + amount);
	}
	
	// Card Payment 
	public void pay(String cardNumber, double amount) {
		System.out.println("Payment successful with Card.");
		System.out.println("Card Number :" + cardNumber);
		System.out.println("Amount :" + amount);
	}
	
	//UPI Payment
	public void pay(double amount, String upiId) {
		System.out.println("Payment successful with UPI.");
		System.out.println("UPI ID :" + upiId);
		System.out.println("Amount :" + amount);	
	}
	
	// Netbanking Payment
	public void pay(String bankName, double amount, long netbankingRef) {
		System.out.println("Payment successful with NetBanking.");
		System.out.println("Bank :" + bankName);
		System.out.println("Amount :" + amount);
		System.out.println("Ref ID :" + netbankingRef);
	}
	
	// Wallet Payment
	public void pay(String walletName, double amount, int walletID) {
		System.out.println("Paymnet successful with wallet.");
		System.out.println("Wallet :" + walletName);
		System.out.println("Amount :" + amount);
		System.out.println("WalletID :" + walletID);
	}
	

}
