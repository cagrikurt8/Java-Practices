package main;

public class Canary extends Pet {
	protected String name;
	public void setName(String aName) { name=aName; }
	public String getName() { return name; }
	public String classOfAnimal() { return("Canary"); }
}
