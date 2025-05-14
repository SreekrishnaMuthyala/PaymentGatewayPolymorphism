# Payment Gateway Example Using Method Overloading

## Description
This Java-based project demonstrates a simple **payment gateway** system using **method overloading**. The system supports different payment methods such as **Cash on Delivery (COD)**, **Credit/Debit Card**, **UPI**, **NetBanking**, and **Wallet**.

### Technologies Used:
- **Java** for backend development
- **Eclipse IDE** for project management
- **Git** for version control

## Features
- Multiple **payment methods** implemented using **method overloading**.
- Demonstrates **polymorphism** through method overloading in Java.
- Easy to expand with more payment methods in the future.

### Example

```java
public class PaymentGateway {

    public void pay(String paymentMethod, double amount) {
        System.out.println(paymentMethod + " payment of amount " + amount + " is successful.");
    }

    public void pay(String paymentMethod, double amount, String cardNumber) {
        System.out.println(paymentMethod + " payment of amount " + amount + " using card number " + cardNumber + " is successful.");
    }

    public void pay(String paymentMethod, double amount, String upiId) {
        System.out.println(paymentMethod + " payment of amount " + amount + " using UPI ID " + upiId + " is successful.");
    }

    // Additional overloaded methods can be added for other payment methods like Wallet, NetBanking, etc.
}

