package source;

public class Display {
	private String model;
	private int numberOfColor;
	
	public Display(){
		
	}
	
	public Display(String model, int numberOfColor) {
		super();
		this.model = model;
		this.numberOfColor = numberOfColor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfColor() {
		return numberOfColor;
	}

	public void setNumberOfColor(int numberOfColor) {
		this.numberOfColor = numberOfColor;
	}

	@Override
	public String toString() {
		return "Display [model=" + model + ", numberOfColor=" + numberOfColor + "]";
	}
	
	
}
