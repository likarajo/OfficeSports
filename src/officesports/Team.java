package officesports;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "team")

public class Team {
	private int team_id;
	private String team_name;
	
	public Team(int team_id, String team_name) {
		this.team_id = team_id;
		this.team_name = team_name;
	}
	
	public int getTeamId() { 
	    return team_id; 
	}  
	@XmlElement 
	public void setTeamId(int team_id) { 
	    this.team_id = team_id; 
	} 
	public String getTeamName() { 
	    return team_name; 
	}  
	@XmlElement 
	public void setTeamName(String team_name) { 
	    this.team_name = team_name; 
	}
	
}
