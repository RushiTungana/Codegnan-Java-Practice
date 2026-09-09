package comm.oop.project1.Animal;

public class LionEntity {
	private static int legs=4;
	private String name;
	private String gender;
	private int kills;
	public LionEntity() {
		
		
	}
	public LionEntity(String name, String gender, int kills) {
		super();
		this.name = name;
		this.gender = gender;
		this.kills = kills;
	}
	public static int getLegs() {
		return legs;
	}
	public static void setLegs(int legs) {
		LionEntity.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public void animalDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Gender: "+this.gender);
		System.out.println("Kills: "+this.kills);
		System.out.println("legs: "+this.legs);

	}
	

}
