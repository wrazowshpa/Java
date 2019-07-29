package application;

public class PropertySeeker {
	
	private String keywords;
	private String rooms;
	private Object buildingType;
	private Month dateStarting;
	private String openHouse;
	private double price;
	
	public String getKeywords() {
		return keywords;
	}
	
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	
	public String getRooms() {
		return rooms;
	}
	
	public void setRooms(String rooms) {
		this.rooms = rooms;
	}
	
	public Object getBuildingType() {
		return buildingType;
	}
	
	public void setBuildingType(Object buildingType) {
		this.buildingType = buildingType;
	}
	
	public Month getdateStarting() {
		return dateStarting;
	}
	
	public void setDateStarting(Month dateStarting) {
		this.dateStarting = dateStarting;
	}
	
	public String getOpenHouse() {
		return openHouse;
	}
	
	public void setOpenHouse(String openHouse) {
		this.openHouse = openHouse;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getInfo() {
		return "Price is: " +price+" Number of Rooms " +rooms+ " Keywords: " +keywords+" Month Starting: "+dateStarting+" Building Type: "+buildingType+" Open House: "+openHouse+"";
	}


}
