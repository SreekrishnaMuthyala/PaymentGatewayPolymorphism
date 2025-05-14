package com;

public class PaymentTest {
	public static void main(String[] args) {
		Payment pg = new Payment();
		pg.pay(6000);
		pg.pay("1234-3456-5678", 3000);
		pg.pay(2500, "user@upi");
		pg.pay("ICICI", 5500, 7660840876L);
		pg.pay("PhonePe", 600, 101);
		
	}

}
