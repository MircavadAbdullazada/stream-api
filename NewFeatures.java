package Lesson19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class NewFeatures {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("Huseyn", 21,"208i",4));
		users.add(new User("Hesen", 26,"208b",3));
		users.add(new User("Rauf", 23,"208d",1));
		
		users.stream().
		filter(user -> user.getCourse() > 2 && user.getAge() > 20)
			.sorted((o1, o2) -> o1.getGroup().compareTo(o2.getGroup()))
			.map(user -> new Employee(user.getName(), user.getAge()))
			.collect(Collectors.toList())
			.forEach(employee->System.out.println("Employee [Name:"+employee.getName()+" age:"+employee.getAge()+"]"));
		

		
		
	
	}
}
	
	  class User {
		  String name;
		  int age;
		  String group;
		  int course;
		

		public User(String name, int age, String group, int course) {
	
			this.name = name;
			this.age = age;
			this.group = group;
			this.course = course;
		}
			
		
		

		@Override
		public String toString() {
			return String.format("User [name=%s, age=%s, group=%s, course=%s]", name, age, group, course);
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}




		public String getGroup() {
			return group;
		}




		public void setGroup(String group) {
			this.group = group;
		}

				


		public int getCourse() {
			return course;
		}




		public void setCourse(int course) {
			this.course = course;
		}




		public void talk() {
			System.out.println("Hi my name is "+ this.name);
		}
	}
	  class Employee{
		  String name;
		  int age;
		public Employee(String name, int age) {
			super();
			this.name = name;
			this.age = age;
			
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return String.format("Employee [name=%s, age=%s]", name, age);
		}
		  
		  
	  }
	  
