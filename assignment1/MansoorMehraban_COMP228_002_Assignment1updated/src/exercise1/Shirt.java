package exercise1;
import exercise2.Label;

public class Shirt {
	
	/** 
	 * Author : Mansoor Mehraban
	 * Description : * This class is used to get and set the variables for the object
	 */
	
	public String color; 
	public char size;
	public int ageRange;
	public boolean isForMen;
	public Label label;
	
	
	
	public Shirt() {
		
	}
	
	
	/* 
	 * 
	 * These getter methods retrieve data from the object
	 * 
	 */
	
	
	public String getColor() {
	  return color;
	}

	public char getSize() {
	  return size;
	}

	public int getAgeRange() {
	  return ageRange;
	}
	
	public boolean getisForMen() {
	  return isForMen;
	}
	
	public String getLabel() {
		return String.format("Fabric: %s%nCaring Instructions %s", label.getFabric(), label.getCaringInstructions());
	}
	
	/* 
	 * 
	 * These setter methods insert information into the object
	 * 
	 */

	public void setColor(String color) {
	  this.color = color;
	}

	public void setSize(char size) {
	  this.size = size;
	}

	public void setAgeRange(int ageRange) {
	  this.ageRange = ageRange;
	}
		
	public void setisForMen(boolean isForMen) {
	  this.isForMen = isForMen;
	}
	
	public void setLabel(Label label) {
		this.label = label;
	}
	
	public String getInformation() {
				
		return String.format("Color: %s%nsize: %s%nage range: %d%nis for men: %s%n%s%n", getColor(), getSize(), getAgeRange(), getisForMen(), getLabel());
		  
	}
	
	
		
	
	
	
	
	
	

}
