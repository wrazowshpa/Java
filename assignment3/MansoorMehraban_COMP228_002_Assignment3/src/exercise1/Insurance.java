package exercise1;

public abstract class Insurance {
	
	public String typeOfInsurance;
	public double monthlyCost;
	
	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}
	
	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	public abstract void setInsuranceCost();
	public abstract void displayInfo();
}
