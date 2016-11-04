package source;

import java.util.Comparator;

public class Human implements Comparator<Human>{
	
	protected String firstName;
	protected String lastName;
	
	public Human(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Human o1, Human o2) {
		// TODO Auto-generated method stub
		if(o1.firstName.compareToIgnoreCase(o2.firstName) == 0){
			return o1.lastName.compareToIgnoreCase(o2.lastName);
		}
		return o1.firstName.compareToIgnoreCase(o2.firstName);
	}
 
}
