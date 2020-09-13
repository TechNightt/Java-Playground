/*********************************************************************************************************************
 Get Sum of People's Budget

Create the function that takes an array with objects and returns the sum of people's budgets.

Examples
getBudgets([
  { name: "John", age: 21, budget: 23000 },
  { name: "Steve",  age: 32, budget: 40000 },
  { name: "Martin",  age: 16, budget: 2700 }
]) ➞ 65700

getBudgets([
  { name: "John",  age: 21, budget: 29000 },
  { name: "Steve",  age: 32, budget: 32000 },
  { name: "Martin",  age: 16, budget: 1600 }
]) ➞ 62600

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.IntStream;

public class Program {	
	public static double getBudgets(Person[] persons) {
		double reduce = Arrays.stream(persons)
				 .map(item -> item.getBudget())
				 .reduce(0.0, (a,b)-> a + b);
		
		System.out.println(reduce);
		return reduce;
	}
}	

class Person{
	private String name;
	private int age;
	private double budget;
		
	public Person(String name, int age, double budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
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
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}	
}




//#############################################################
//#                        MY SOLUTION 2   



import java.util.Arrays;
import java.util.stream.IntStream;

public class Program {	
	public static double getBudgets(Person[] persons) {
		return Arrays.asList(persons).stream().map(p -> p.getBudget()).reduce(0d, Double::sum);
	}
}	

class Person{
	private String name;
	private int age;
	private double budget;
		
	public Person(String name, int age, double budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
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
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}	
}


