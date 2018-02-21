package setsAndMaps;

public class Player implements Comparable<Player>{

	private String lastName;
	private String firstName;
	
	
	
	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public Player(String lastName, String firstName) {

		this.lastName = lastName;
		this.firstName = firstName;
	}



	@Override
	public int compareTo(Player p) {
		
		return firstName.compareTo(p.firstName);
	}

	public String toString()
	{
		return "Player Name: "+ lastName+","+firstName;
	}
}
