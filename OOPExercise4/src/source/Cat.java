package source;

public class Cat extends Animal implements ISound{

	public Cat(double age, String name, Sex sex) {
		super(age, name, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "meow moew";
	}

}
