package officesports;

import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "sports")

public class Sports { 
	   private int id; 
	   private String type;
	   private int team_size;
	   private int min_teams;
	   private int max_teams;
	     
	   public Sports(){} 
	     
	   public int getId() { 
	      return id; 
	   }  
	   public String getType() { 
		  return type; 
	   }
	   public int getTeamSize() {
		   return team_size;
	   }
	   public int getMinTeams() {
		   return min_teams;
	   }
	   public int getMaxTeams() {
		   return max_teams;
	   }
} 

