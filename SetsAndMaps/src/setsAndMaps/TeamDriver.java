package setsAndMaps;
import java.io.*;
import java.util.*;

public class TeamDriver {

    public static void main(String[] args) throws FileNotFoundException {
// Create a HashSet of Team and name it as 'hashTeams'.
    	HashSet<Team> hashTeams;

// Create a TreeMap of Player as Key and HashSet<Team> as value and name it as treeMaps.
    	TreeMap<Player,HashSet<Team>> treeMaps = new TreeMap<>();
    	
    	Scanner scan = new Scanner(new File("C:\\Users\\vamsh\\eclipse-workspace\\SetsAndMaps\\src\\setsAndMaps\\teams.txt"));
/*
Create a Scanner object to read Players and Team details from "teams.txt" file. 
 The data in the text file will be in the following order: player last name, player first name, team name, team coach name, team teamPrice, number of players in team squad, and owner(s) of the team separated by comma separator.
*/

// while teams.txt has more data
while(scan.hasNext()) {
	String ln = scan.nextLine();
	String fn = scan.nextLine();
	
	Player p = new Player(ln,fn);
	
	String a = scan.nextLine();
	String b = scan.nextLine();
	//scan.nextLine();
	double c = scan.nextDouble();
	scan.nextLine();
	int d = scan.nextInt();
	scan.nextLine();
	String e = scan.nextLine();
	String[] temp = e.split(",");
    
	Team t = new Team(a,b,c,d,temp);
	
	if(!treeMaps.containsKey(p))
	{
		hashTeams = new HashSet<>();
		hashTeams.add(t);
		treeMaps.put(p, hashTeams);
	}
	else if (treeMaps.containsKey(p) && treeMaps.get(p)==null)
	{
		hashTeams = new HashSet<>();
		treeMaps.put(p, hashTeams);
	}
	else
	{
		
		treeMaps.get(p).add(t);
	}

}
scan.close();

}
}
