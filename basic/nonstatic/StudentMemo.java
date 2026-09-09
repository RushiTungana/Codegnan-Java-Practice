package com.basic.nonstatic;

class Card {
	
	private String name;
	private double tenthPer;
	private double interPer;
	private double degreePer;
	
	public Card() {
		
	}

	public Card(String name, double tenthPer) {
		this.name = name;
		this.tenthPer = tenthPer;
		System.out.println("1st constructor for name, tenth");
	}
	
	public Card(String name, double tenthPer, double interPer) {
		this(name, tenthPer);
		this.interPer = interPer;
		System.out.println("2nd constructor for inter");
	}
	
	public Card(String name, double tenthPer, double interPer, double degreePer) {
		this(name, tenthPer, interPer);
		this.degreePer = degreePer;
		System.out.println("3rd constructor for degree");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTenthPer() {
		return tenthPer;
	}

	public void setTenthPer(double tenthPer) {
		this.tenthPer = tenthPer;
	}

	public double getInterPer() {
		return interPer;
	}

	public void setInterPer(double interPer) {
		this.interPer = interPer;
	}

	public double getDegreePer() {
		return degreePer;
	}

	public void setDegreePer(double degreePer) {
		this.degreePer = degreePer;
	}

	public void memoCard() {

		System.out.println("Name: "+this.name);
		System.out.println("Tenth %: "+this.tenthPer);
		if(this.interPer > 0.0)
		System.out.println("Inter %: "+this.interPer);
		
		if(this.degreePer > 0.0)
		System.out.println("Degree%: "+this.degreePer);
	}
	
	
}
public class StudentMemo {

	public static void main(String[] args) {
		
		Card s1 = new Card("Kondalrao", 56.31);
		
		s1.memoCard();
		System.out.println("==============");
		Card s2 = new Card("Pulla rao", 56.31, 63.21);
		
		s2.memoCard();
		
		System.out.println("==============");
		
		Card s3 = new Card("Poshaiah", 56.31, 68.90, 69.90);
	
		s3.memoCard();
	
	}
}