package Java8Logical;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Team {
	
	private List<Player> players;
	
	public int getScore() {
		return players.stream().mapToInt(p->p.getScore()).reduce(0, (a,b)-> a + b);
	}
	
	public Map<String, List<Player>> getBySkills(){
		Map<String, List<Player>> cl = players.stream().collect(Collectors.groupingBy(Player::getType));
		return cl;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
		
	
	
	
 
}
