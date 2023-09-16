package Java8Logical;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		Player p1=new Player("sachin",100,"batsman");
		Player p2=new Player("msd",50,"batsman");
		Player p3=new Player("kumble",25,"bowler");
		Player p4=new Player("zahir",25,"bowler");
		
		List<Player> players=new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
	
	    Team team=new Team();
	    team.setPlayers(players);
	    
	    int totalScore=team.getScore();
	    
	    System.out.println(totalScore);
	    
	    System.out.println(team.getBySkills());
	}

}
