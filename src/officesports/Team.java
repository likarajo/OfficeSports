package officesports;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "team")

public class Team {
	private int team_id;
	private String team_name;
	private int emp_id;
	
	public Team(int team_id, String team_name, int emp_id) {
		this.team_id = team_id;
		this.team_name = team_name;
		this.emp_id = emp_id;
	}
	
	public int getTeamId() { 
	    return team_id; 
	}  
	@XmlElement 
	public void setTeamId(int team_id) { 
	    this.team_id = team_id; 
	} 
	public int getEmpId() { 
	    return emp_id; 
	}  
	@XmlElement 
	public void setEmpId(int emp_id) { 
	    this.emp_id = emp_id; 
	} 
	public String getTeamName() { 
	    return team_name; 
	}  
	@XmlElement 
	public void setTeamName(String team_name) { 
	    this.team_name = team_name; 
	}
	
}
