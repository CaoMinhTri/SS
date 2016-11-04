package source;

public abstract class Animal implements ISound{
	protected double age;
	protected String name;
	protected Sex sex;
	
	enum Sex{
		male, female
	}

	public Animal(double age, String name, Sex sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	

}
