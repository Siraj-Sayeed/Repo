
public class Alcohol extends Beverage {
	
	private boolean isWeekend;
	private final double alcPrice = 0.60;

	public Alcohol(String bn, Size bs, boolean wk) {
		
		super(bn,bs);
		super.setBevType(Type.ALCOHOL);
		isWeekend = wk;
		
	}
	
	public String toString() {
		return super.toString() + " Offered: " + isWeekend + " Price: " + calcPrice();
	}

	
	public double calcPrice() {
		
		double toRet = getBasePrice();
		
		if(getBevSize().equals(Size.MEDIUM))
			toRet += getSizeUp();
		
		else if(getBevSize().equals(Size.LARGE))
			toRet += getSizeUp() + getSizeUp();
		
		if(isWeekend)
			toRet += alcPrice;
		
		return toRet;
	}
	
	public boolean equals(Alcohol other) {
		
		if((!((Beverage)(this)).equals((Beverage)(other))))
			return false;
		
		
		if(isWeekend != other.isWeekend)
			return false;
		
		return true;
	}
	
	public boolean isWeekend(){
		return isWeekend;
	}

}
