package exercise3;

public abstract class Mortgage implements MortgageConstants {
	
	int mortgageNum;
	String customerName;
	double amountOfMortgage;
	double interestRate;
	int term;
	
	public double getMortgageNum() {
		return mortgageNum;
	}
	public void setMortgageNum(int num) {
		this.mortgageNum = num;
	} 
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String name) {
		this.customerName = name;
	} 
	
	public double getAmountOfMortgage() {
		return amountOfMortgage;
	}
	public void setAmountOfMortgage(double amountOfMortgage) {
		this.amountOfMortgage = amountOfMortgage;
	} 
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	} 
	
	public double getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	} 
	
	
	public void checkMortgage() {
		
		if(amountOfMortgage > maxMortgageAmount) {
			System.out.println("We do not provide mortgages over 300000");
		}
		else if (term != shortTerm || term != mediumTerm || term != longTerm) {
			term = 1;
		}
		
	}
	
	public String getMortgageInfo() {
		
		return String.format("Mortgage number: "+getMortgageNum()+" CustomerName: "+getCustomerName()+" Amount of Mortgage: "+getAmountOfMortgage()+" Interest Rate: "+getInterestRate()+" Term: "+getTerm()+"");
	}

}
