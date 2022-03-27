/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DebitCard;

/**
 * @author Charmaine Helven G. Resma
 * Date: March 3, 2022
 */
public class DebitCard {
       private String cardNumber;
	private Name name;
	private float balance = 0.00F;

	public DebitCard(){}

	public DebitCard(String cardNumber, Name name, float balance){
		this.cardNumber = cardNumber;
		this.name = name;
		this.balance = balance;
	}

	public void setCardNumber(String cardNumber){
		this.cardNumber = cardNumber;
	}

	public void setName(Name name){
		this.name = name;
	}

	public void setBalance(float balance){
		this.balance = balance;
	}

	public String getCardNumber(){
		return cardNumber;
	}

	public Name getName(){
		return name;
	}

	public float getBalance(){
		return balance;
	}

	public float inquireBalance(){
		return this.getBalance();
	}

	public float depositCash(float amount){
		this.balance += amount;

		return this.balance;
	}

	public boolean withdrawCash(float amount){
		boolean success = true;
		if(this.balance > amount){
			this.balance -= amount;
		} else { 
			success = false;
		}

		return success;
	}
	
	public float interest(float rate){
		// Accrued Interest formula as Interest incurred
		float accruedInterest = ((rate/100) / 360) * 30 * this.balance;
		float rateAmount = this.balance * (accruedInterest/100);
    
		this.balance += rateAmount;
		return accruedInterest;
	}

	@Override
	public String toString(){
		return "Name: " + name.toString() +
			   "\nAccount number: " + this.getCardNumber() +
			   "\nBalance: " + String.format("%.2f", this.getBalance())+"\n";
	}
}
