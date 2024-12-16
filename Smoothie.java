
public class Smoothie extends Beverage {
	
	private int numOfFruit;
	private boolean protein;
	private final double proteinPrice = 1.50;
	private final double eachFruit = 0.50;

	public Smoothie(String bn, Size bs, int nof, boolean p) {
		
		super(bn, bs);
		super.setBevType(Type.SMOOTHIE);
		
		if(nof <= 5)
			numOfFruit = nof;
		else {
			System.out.println("The max numnber of fruit is 5, 5 fruits will be added to your order");
			numOfFruit = 5;
		}
		
		protein = p;
		
	}
	
	public String toString() {
		return super.toString() + " Number of Fruit: " + numOfFruit + " Protein: " + protein + " Price: " + calcPrice();
	}


	public double calcPrice() {
		
		double toRet = getBasePrice();
		
		if(getBevSize().equals(Size.MEDIUM))
			toRet += getSizeUp();
		
		else if(getBevSize().equals(Size.LARGE))
			toRet += getSizeUp() + getSizeUp();
		
		if(protein)
			toRet += proteinPrice;
		
		toRet += (numOfFruit * eachFruit);
		
		return toRet;
	}
	
	public boolean equals(Smoothie other) {
		
		if((!((Beverage)(this)).equals((Beverage)(other))))
			return false;
		
		
		if(protein != other.protein)
			return false;
		
		if(numOfFruit != other.numOfFruit)
			return false;
		
		return true;
	}

}
