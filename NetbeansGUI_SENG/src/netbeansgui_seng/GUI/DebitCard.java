/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansgui_seng.GUI;

/**
 *
 * @author Genica Mae Seng
 */
public class DebitCard{
	private String cardNumber;
	private Name name;
	// para maiwasan ko yung error sa balance format ng float kaya set ko sa 0.00F
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
		return this.cardNumber;
	}

	public Name getName(){
		return this.name;
	}

	public float getBalance(){
		return this.balance;
	}

	public float depositCash(float amt){
		this.balance += amt;
		return this.balance;
	}

	public boolean withdrawCash(float amt){
		boolean result = true;
		if(amt < this.balance)
			this.balance -= amt;
		else 
			result = false;
		return result;
	}

	public float inquireBalance(){
		return this.getBalance();
	}
	
	public float interest(float rate){
		float annualAssumption = ((rate/100) / 360) * 30;
		float interestIncurred = annualAssumption * this.balance;
		float amtRateResult = this.balance * (interestIncurred/100);

		this.balance += amtRateResult;
		return interestIncurred;
	}

	public String toString(){
		return "Name: " + name.toString() + "\nAccount number: " + this.getCardNumber() + "\nBalance: " + String.format("%.2f", this.getBalance())+"\n";
	}
}