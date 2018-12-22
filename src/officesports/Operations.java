package officesports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Operations {
	
	//function to register team
	public void register_team(int sports_id, int team_id) {
		Event event = new Event();
		 
		try
	    {
	      String myDriver = "org.gjt.mm.mysql.Driver";
	      String myUrl = "jdbc:mysql://localhost/sports";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "", "");
	      
	      String team_count = "select count(team_id) as tcount from event where sport_id="+sports_id;
	      String max_teams = "select team_max from sports where sport_id="+sports_id;
	      String emp_count = "select count(emp_id) as ecount from team where team_id="+team_id;
	      String team_size = "select team_size from sports where sport_id="+sports_id;
	      
	      Statement st = conn.createStatement();
	      
	      ResultSet rs1 = st.executeQuery(team_count);
	      int tcount = 0;
	      while (rs1.next()){tcount = rs1.getInt("tcount");}
	      
	      ResultSet rs2 = st.executeQuery(max_teams);
	      int maxt = 0;
	      while (rs2.next()){maxt = rs2.getInt("team_max");}
	      
	      ResultSet rs3 = st.executeQuery(emp_count);
	      int ecount = 0;
	      while (rs1.next()){ecount = rs1.getInt("ecount");}
	      
	      ResultSet rs4 = st.executeQuery(team_size);
	      int tsize = 0;
	      while (rs3.next()){tsize = rs4.getInt("team_size");}
	      
	      st.close();
	      
	      // check if number of teams registered against a particular sport is already reached allowed limit
	      // and if team_size criteria is met
	      if(tcount<maxt && ecount>=tsize) {
				event.setSportsId(sports_id);
				event.setTeamId(team_id);
	      }
	      else {
	    	  System.out.println("Teams cannot be registered for the event with sports id:"+ sports_id);
	      }
	      
	    }
	    catch (Exception e)
	    {
	      System.err.println(e.getMessage());
	    }
		
	}
	
}
