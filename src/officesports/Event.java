package officesports;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "event")

public class Event {
	private int sports_id;
	private int team_id;
	
	public Event() {}
	
	public Event(int sports_id, int team_id) {
		this.sports_id = sports_id;
		this.team_id = team_id;
		
	}
	
	public int getSportsId() { 
	    return sports_id; 
	}  
	@XmlElement 
	public void setSportsId(int sports_id) { 
	    this.sports_id = sports_id; 
	}
	
	public int getTeamId() { 
	    return team_id; 
	}  
	@XmlElement 
	public void setTeamId(int team_id) { 
	    this.team_id = team_id; 
	} 
	
}
