
public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	// Constructors
	public Plot(int xCoord, int yCoord, int w, int d) {
		
		x = xCoord;
		y = yCoord;
		width = w;
		depth = d;
		
	}
	
	// getters and setters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setX(int xCoord) {
		x = xCoord;
	}

	public void setY(int yCoord) {
		y = yCoord;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setDepth(int d) {
		depth = d;
	}
	
	// checks to see if two plots overlap
	public boolean overlaps(Plot other) {
		
		
		if(y < (other.y - other.depth) || (y - depth) > other.y)
			return false;
		
		if((x + width) < other.x || x > (other.x + other.width))
			return false;

		
		
		return true;
		
	}
	
	// checks to see if one plot encompasses the other plot
	public boolean encompasses(Plot other) {
		
		if((other.x + other.width) >= (x + width) && other.x <= x)
			if((other.y + other.depth) >= (y + depth) && other.y <= y)
				return true;
			
		return false;
		
	}
	
	public String toString() {
		return x + "," + y + "," + width + "," + depth;
	}
	
	
}
