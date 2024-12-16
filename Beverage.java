
public abstract class Beverage {
	
	private String bevName;
	private Type bevType;
	private Size bevSize;
	private final double basePrice = 2.0;
	private final double sizeUp = 0.5;
	
	public Beverage(String bn, Size bs) {
		
		bevName = bn;
		bevSize = bs;
		
	}
	
	public abstract double calcPrice();
	
	public String toString() {
		
		return bevName + " " + bevType + " " + bevSize; 
		
	}
	
	public boolean equals(Beverage other) {
		
		if(!bevName.equals(other.bevName))
			return false;
		
		if(!bevType.equals(other.bevType))
			return false;
		
		if(!bevSize.equals(other.bevSize))
			return false;
		
		return true;
		
	}
	
	public String getBevName() {
		return bevName;
	}
	
	public Type getType() {
		return bevType;
	}
	
	public Size getBevSize() {
		return bevSize;
	}
	
	public void setBevName(String bn) {
		bevName = bn;
	}
	
	public void setBevType(Type bt) {
		bevType = bt;
	}
	
	public void setBevSize(Size bs) {
		bevSize = bs;
	}

	public double getBasePrice() {
		return basePrice;
	}
	
	public double getSizeUp() {
		return sizeUp;
	}

}
