
public class ManagementCompany {
	
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	
	private String name;
	private String tax;
	private double fee;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties;
	
	// Constructors
	public ManagementCompany(String n, String t, double f) {
		
		name = n;
		tax = t;
		fee = f;
		properties = new Property[MAX_PROPERTY];
		numberOfProperties = 0;
		plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
		
		
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	
	public String getTaxId() {
		return tax;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setTaxId(String t) {
		tax = t;
	}
	
	public void setFee(double f) {
		fee = f;
	}
	
	// checks to see if adding a property is possible
	public int addProperty(Property toAdd) {
		
		// if property cap is hit
		if(isPropertiesFull())
			return -1;
		
		// if property to add is null
		if(toAdd == null)
			return -2;
		
		// if property to add is not within scope of plot
		if(!toAdd.getPlot().encompasses(plot))
			return -3;
		
		// checks if property overalps with any other property
		for(int i = 0; i < numberOfProperties; i++) {
			
			if(toAdd.getPlot().overlaps(properties[i].getPlot()))
				return -4;
			
		}
		
		// if pass all checks, add property and return index added
		properties[numberOfProperties] = toAdd;
		return numberOfProperties++;
		
	}
	
	// loops through properties to get total rent
	public double getTotalRent() {
		
		double total = 0;
		
		for(int i = 0; i < numberOfProperties; i++)
			total += properties[i].getRentAmount();
		
		return total;
		
	}
	
	// loops through properties to find highest rent
	public Property getHighestRentPropperty() {
		
		int propertyIndex = 0;
		double max = 0;
		
		for(int i = 0; i < numberOfProperties; i++) {
		
			if(max < properties[i].getRentAmount()) {
				max = properties[i].getRentAmount();
				propertyIndex = i;
				
			}
			
		}
		
		return properties[propertyIndex];
		
	}
	
	// removes last property
	public void removeLastProperty() {
		
		properties[numberOfProperties-1] = null;
		numberOfProperties--;
		
	}
	
	// checks number of properties
	public boolean isPropertiesFull() {
		return numberOfProperties == properties.length;
	}
	
	public int getPropertiesCount() {
		return numberOfProperties;
	}
	// checks if fee is valid
	public boolean isManagementFeeValid() {
		return fee > 0 && fee < 100;
	}
	
	// calculates total cost from fees
	private double calculateTotalFee() {
		double toRet = 0.0;
		
		for(int i = 0; i < numberOfProperties; i++) {
			
			toRet += ((properties[i].getRentAmount() * fee)/100);
			
		}
		
		return toRet;
	}
	
	public String toString() {
		
		
		String toRet = "List of the properties for " + name + ", taxID: " + tax;
		toRet += "\n______________________________________________________\n";
		for(int i = 0; i < numberOfProperties; i++) {
			
			toRet += properties[i] + "\n";
			
		}
		toRet += "______________________________________________________\n";
		
		toRet += "\ntotal management Fee: " + calculateTotalFee();
		
		return toRet;
	}
	
}