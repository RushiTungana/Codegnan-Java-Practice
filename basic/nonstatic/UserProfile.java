package com.basic.nonstatic;
class Profile{
	private String firstname;
	private String lastname;
	private int age;
	private String mobile;
	private String username;
	private String email;
	private String gender;
	
	public Profile(){
		System.out.println(this);
		System.out.println("Enter the first name: ");
		System.out.println("Enter the last number: ");
		System.out.println("Enter the age: ");
		System.out.println("Enter the mobile: ");
		System.out.println("Enter the username: ");
		System.out.println("Enter the email: ");
		System.out.println("Enter the gender: ");
		
	}

	public Profile(String firstname, String lastname, int age, String mobile, String username, String email,
			String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.mobile = mobile;
		this.username = username;
		this.email = email;
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public void UserDetail() {
		
		System.out.println("First Name: "+firstname);
		System.out.println("Last Name: "+lastname);
		System.out.println("Age: "+age);
		System.out.println("Mobile number: "+mobile);
		System.out.println("UserName: "+username);
		System.out.println("Email: "+email);
		System.out.println("Gender: "+gender);
		

	}
}
public class UserProfile {

	public static void main(String[] args) {
		Profile p1=new Profile();
		p1.setFirstname("Shiva");
		p1.setLastname("Jada");
		p1.setAge(28);
		p1.setMobile("9059101049");
		p1.setUsername("Shiva6578jada");
		p1.setEmail("jadashiva420@gmail.com");
		p1.setGender("Male");
		p1.UserDetail();
		System.out.println("=============");
		
		Profile p2=new Profile();
		p2.setFirstname("hemanth");
		p2.setLastname("kuppili");
		p2.setAge(24);
		p2.setMobile("9059101432");
		p2.setUsername("Kuppilihemanth6547#");
		p2.setEmail("Kuppilihemanth320@gmail.com");
		p2.setGender("Male");
		p2.UserDetail();
		System.out.println("=============");

	}

}
