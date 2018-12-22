package officesports;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "teamMembers")

public class TeamMembers {
	private int team_id;
	private int emp_id;
	
	public TeamMembers() {}
	
	public TeamMembers(int team_id, int emp_id) {
		this.team_id = team_id;
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
	
}

