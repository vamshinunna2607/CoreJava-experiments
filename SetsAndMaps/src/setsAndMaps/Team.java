package setsAndMaps;

import java.util.Arrays;

public class Team {
	
	private String nameOfTheTeam;
	private String coachOfTheTeam;
	private double teamPrice;
	private int noOfPlayersInTheTeam;
	private String [] ownerOfTheTeam;
	
	public Team(String nameOfTheTeam, String coachOfTheTeam, double teamPrice, int noOfPlayersInTheTeam,
			String[] ownerOfTheTeam) {
		
		this.nameOfTheTeam = nameOfTheTeam;
		this.coachOfTheTeam = coachOfTheTeam;
		this.teamPrice = teamPrice;
		this.noOfPlayersInTheTeam = noOfPlayersInTheTeam;
		this.ownerOfTheTeam = ownerOfTheTeam;
	}

	public String getNameOfTheTeam() {
		return nameOfTheTeam;
	}

	public void setNameOfTheTeam(String nameOfTheTeam) {
		this.nameOfTheTeam = nameOfTheTeam;
	}

	public String getCoachOfTheTeam() {
		return coachOfTheTeam;
	}

	public void setCoachOfTheTeam(String coachOfTheTeam) {
		this.coachOfTheTeam = coachOfTheTeam;
	}

	public double getTeamPrice() {
		return teamPrice;
	}

	public void setTeamPrice(double teamPrice) {
		this.teamPrice = teamPrice;
	}

	public int getNoOfPlayersInTheTeam() {
		return noOfPlayersInTheTeam;
	}

	public void setNoOfPlayersInTheTeam(int noOfPlayersInTheTeam) {
		this.noOfPlayersInTheTeam = noOfPlayersInTheTeam;
	}

	public String[] getOwnerOfTheTeam() {
		return ownerOfTheTeam;
	}

	public void setOwnerOfTheTeam(String[] ownerOfTheTeam) {
		this.ownerOfTheTeam = ownerOfTheTeam;
	}

	@Override
	public String toString() {
		return "Team: nameOfTheTeam = " + nameOfTheTeam + ", coachOfTheTeam = " + coachOfTheTeam + ", teamPrice = "
				+ teamPrice + ", noOfPlayersInTheTeam = " + noOfPlayersInTheTeam + ", ownerOfTheTeam = "
				+ Arrays.toString(ownerOfTheTeam);
	}
	
	
	
	

}
