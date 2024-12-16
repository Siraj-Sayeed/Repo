
public class Coffee extends Beverage{
	
	private boolean extraShot;
	private boolean extraSyrup;
	private final double shotPrice = 0.50;
	private final double syrupPrice = 0.50;

	public Coffee(String bn, Size bs, boolean exSh, boolean exSy) {
		
		super(bn, bs);
		super.setBevType(Type.COFFEE);
		
		extraShot = exSh;
		extraSyrup = exSy;
		
	}

	
	public double calcPrice() {
		
		double toRet = getBasePrice();
		
		if(getBevSize().equals(Size.MEDIUM))
			toRet += getSizeUp();
		
		else if(getBevSize().equals(Size.LARGE))
			toRet += getSizeUp() + getSizeUp();
		
		if(extraShot)
			toRet += shotPrice;
		
		if(extraSyrup)
			toRet += syrupPrice;
		
		return toRet;
	}
	
	public String toString() {
		return super.toString() + " Extra Shot: " + extraShot + " Extra Syrup: " + extraSyrup + " Price: " + calcPrice();
	}
	
	public boolean equals(Coffee other) {
		
		if((!((Beverage)(this)).equals((Beverage)(other))))
			return false;
		
		
		if(extraShot != other.extraShot)
			return false;
		
		if(extraSyrup != other.extraSyrup)
			return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Coffee test = new Coffee("s", Size.LARGE, false, false);
		
		System.out.println(test.calcPrice());
		
	}
	
	

}
