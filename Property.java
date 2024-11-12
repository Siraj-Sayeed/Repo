
public class Property {
	
	private String propertyName;
	private String city;
	private String owner;
	private double rent;
	private Plot plot;
	
	// Constructors
	public Property(String pn, String c, double r, String o, int x, int y, int width, int depth) {
		
		propertyName = pn;
		city = c;
		owner = o;
		rent = r;
		plot = new Plot(x, y, width, depth);
		
	}
	
	public Property(String pn, String c, double r, String o) {
		
		propertyName = pn;
		city = c;
		owner = o;
		rent = r;
		plot = new Plot(0,0,1,1);
		
	}
	
	// getters and setters
	public String getPropertyName() {
		return propertyName;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getRentAmount() {
		return rent;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public void setPropertyName(String pn) {
		propertyName = pn;
	}
	
	public void setCity(String c) {
		city = c;
	}
	
	public void setOwner(String o) {
		owner = o;
	}
	
	public void setRentAmount(double r) {
		rent = r;
	}
	
	public void setPlot(Plot p) {
		plot = p;
	}
	
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rent;
	}
	

}
