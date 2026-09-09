package com.basic.nonstatic;  
//Encapulation;
class Flower{
	private String name;
	private int petals;
	public Flower() {
		System.out.println("Set the name: ");
		System.out.println("Set the number of petals: ");
	}
	public Flower(String name, int petals) {
		super();
		this.name = name;
		this.petals = petals;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPetals() {
		return petals;
	}
	public void setPetals(int petals) {
		this.petals = petals;
	}
	public void greet(String purpose) {
		System.out.println("Name: "+name);
		System.out.println("Petals: "+petals);
		System.out.println(purpose);
	}
}


public class UseFlower {

	public static void main(String[] args) {
		
		Flower f1=new Flower();
		f1.setName("Jasmine");
		f1.setPetals(6);
		
		f1.greet("Geetha");
		System.out.println("===========");
		
		Flower f2=new Flower();
		f2.setName("Rose");
		f2.setPetals(26);
		f2.greet("pushpa raj");
		System.out.println("===========");
		
		Flower f3=new Flower();
		f3.setName("Sunflower");
		f3.setPetals(70);
		f3.greet("To girl");
		System.out.println("===========");
		
		Flower[] allFlowers= {f1,f2,f3};
		for(Flower k:allFlowers) {
			System.out.println("Flower name: "+k.getName());
			//System.out.println("Flower name: "+k.getPetals());
			
		}
		

		
		
		

	}

}
