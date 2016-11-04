package source;

import java.util.ArrayList;
import java.util.List;

import source.Animal.Sex;

public class Main {
	
	public static double calculateAverageAgeOfDog(List<Animal> animals){
		int sum = 0;
		int count = 0;
		for (Animal animal : animals) {
			if(animal instanceof Dog){
				sum += animal.getAge();
				count++;
			}
		}
		return sum/count;
	}
	
	public static double calculateAverageAgeOfFrog(List<Animal> animals){
		double sum = 0;
		double count = 0;
		for (Animal animal : animals) {
			if(animal instanceof Frog){
				sum += animal.getAge();
				count++;
			}
		}
		return sum/count;
	}
	
	public static double calculateAverageAgeOfCat(List<Animal> animals){
		int sum = 0;
		int count = 0;
		for (Animal animal : animals) {
			if(animal instanceof Cat || animal instanceof Tomcat || animal instanceof Kitten){
				sum += animal.getAge();
				count++;
			}
		}
		return sum/count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog(10, "dog1", Sex.male);
		Animal dog2 = new Dog(12, "dog2", Sex.female);
		
		Animal frog1 = new Frog(15, "frog1", Sex.male);
		Animal frog2 = new Frog(20, "frog2", Sex.female);
		
		Animal tomcat = new Tomcat(15, "tomcat");
		Animal kitten = new Kitten(25, "kitten");
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(dog1);
		animals.add(dog2);
		animals.add(frog1);
		animals.add(frog2);
		animals.add(kitten);
		animals.add(tomcat);
		
		System.out.println("Average Age Of Cat: " + calculateAverageAgeOfCat(animals));
		System.out.println("Average Age Of Dog: " + calculateAverageAgeOfDog(animals));
		System.out.println("Average Age Of Frog: " + calculateAverageAgeOfFrog(animals));
		
	}

}
