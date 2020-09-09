package model;
public class Student{
	private String name;
	private int age;
	private double cash;
	
	public Student(String name, int age, double cash){
		this.name = name;
		this.age = age;
		this.cash = cash;
}

public String sayHey(){
	return "my name is "+name+" and i'm "+age+" years old";
}
}