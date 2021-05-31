package main;

interface Vegetarian {
	String food();
}

public class Hamster extends Pet implements Vegetarian {
	public String food() {return "beans";}
	protected String name;
	public void setName(String aName) { name=aName; }
	public String getName() { return name; }
	public String classOfAnimal() { return("Hamster"); }
}
