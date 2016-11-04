package source;

public class Dog extends Animal implements ISound{

	public Dog(double age, String name, Sex sex) {
		super(age, name, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "goo goo";
	}

}
