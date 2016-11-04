package source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Worker> workers = new LinkedList<Worker>();
		workers.add(new Worker("worker1", "worker1", 1000, 8));
		workers.add(new Worker("worker2", "worker2", 5000, 8));
		workers.add(new Worker("worker3", "worker3", 4000, 8));
		workers.add(new Worker("worker4", "worker4", 6000, 8));
		workers.add(new Worker("worker5", "worker5", 7000, 8));
		workers.add(new Worker("worker6", "worker6", 3000, 8));
		workers.add(new Worker("worker7", "worker7", 2000, 8));
		workers.add(new Worker("worker8", "worker8", 8000, 8));
		workers.add(new Worker("worker9", "worker9", 7500, 8));
		workers.add(new Worker("worker10", "worker10", 10000, 8));
		
		Collections.sort(workers);
		for (Worker worker : workers) {
			System.out.println(worker.toString());
		}
		
		System.out.println();
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("student1", "student1", 1));
		students.add(new Student("student2", "student2", 2));
		students.add(new Student("student3", "student3", 3));
		students.add(new Student("student4", "student4", 4));
		students.add(new Student("student5", "student5", 5));
		students.add(new Student("student6", "student6", 12));
		students.add(new Student("student7", "student7", 7));
		students.add(new Student("student8", "student8", 8));
		students.add(new Student("student9", "student9", 9));
		students.add(new Student("student10", "student10", 10));
		
		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student.toString());
		}
		
		System.out.println();
		
		List<Human> humans = new ArrayList<Human>();
		
		humans.add(new Worker("worker1", "worker1", 1000, 8));
		humans.add(new Worker("worker2", "worker2", 5000, 8));
		humans.add(new Worker("worker3", "worker3", 4000, 8));
		humans.add(new Worker("worker4", "worker4", 6000, 8));
		humans.add(new Worker("worker5", "worker5", 7000, 8));
		humans.add(new Worker("worker6", "worker6", 3000, 8));
		humans.add(new Worker("worker7", "worker7", 2000, 8));
		humans.add(new Worker("worker8", "worker8", 8000, 8));
		humans.add(new Worker("worker9", "worker9", 7500, 8));
		humans.add(new Worker("worker10", "worker10", 10000, 8));
		
		humans.add(new Student("student3", "student1", 1));
		humans.add(new Student("student2", "student2", 2));
		humans.add(new Student("student3", "student3", 3));
		humans.add(new Student("student4", "student4", 4));
		humans.add(new Student("student5", "student5", 5));
		humans.add(new Student("student6", "student6", 12));
		humans.add(new Student("student7", "student7", 7));
		humans.add(new Student("student8", "student8", 8));
		humans.add(new Student("student9", "student9", 9));
		humans.add(new Student("student10", "student10", 10));
		
		Collections.sort(humans, new Human());
		
		for (Human human : humans) {
			System.out.println(human.toString());
		}
		
//		System.out.println();
//		
//		Human human1 = new Human("a","a");
//		Human human2 = new Human("a","b");
//		System.out.println(human1.compare(human1, human2));
	}

}
