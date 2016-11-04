package source;

public class Frog extends Animal implements ISound {

	public Frog(double age, String name, Sex sex) {
		super(age, name, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "oop oop";
	}

}
