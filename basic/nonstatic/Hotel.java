package com.basic.nonstatic;
class HotelDetails{
	private String name;
	private String street;
	private String city;
	private String state;
	private int rating;
	private long pincode;
	public HotelDetails(){
		System.out.println("Enter the hotel name: ");
		System.out.println("enter the street: ");
		System.out.println("Enter the city: ");
		System.out.println("Enter the state: ");
		System.out.println("Enter the rating: ");
		System.out.println("Enter the pincode: ");
	}
	public HotelDetails(String name, String street, String city, String state, int rating, long pincode) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.rating = rating;
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public void HotelPrin() {
		System.out.println(this);
		System.out.println("The name of hotel is: "+name);
		System.out.println("The street of the "+name+" is: "+street);
		System.out.println("The City of the "+name+" is: "+city);
		System.out.println("The state of the "+name+" is :"+state);
		System.out.println("The rating of the "+name+" is: "+rating);
		System.out.println("The pincode of "+name+" is: "+pincode);
	}
	
}
public class Hotel {

	public static void main(String[] args) {
		HotelDetails h1=new HotelDetails();
		h1.setName("GreenPark");
		h1.setStreet("MG road");
		h1.setCity("Vijayawada");
		h1.setState("Andhra Pradesh");
		h1.setRating(4);
		h1.setPincode(532076);
		h1.HotelPrin();
		System.out.println("=============");
		
		HotelDetails h2=new HotelDetails();
		h2.setName("Hotel Royal Palace");
		h2.setStreet("Park Street");
		h2.setCity("Kolkata");
		h2.setState("West Bengal");
		h2.setRating(3);
		h2.setPincode(700987);
		h2.HotelPrin();
		System.out.println("=============");

	}

}
