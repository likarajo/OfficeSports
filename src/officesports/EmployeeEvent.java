package officesports;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "employeeevent")

public class EmployeeEvent {
	private int emp_id;
	private int event_id;
	
	public EmployeeEvent(int emp_id, int event_id) {
		this.emp_id = emp_id;
		this.event_id = event_id;
	}
	
	public int getEmpId() { 
	    return emp_id; 
	}  
	@XmlElement 
	public void setEmpId(int emp_id) { 
	    this.emp_id = emp_id; 
	} 
	public int getEventId() { 
	    return event_id; 
	}  
	@XmlElement 
	public void setEventId(int event_id) { 
	    this.event_id = event_id; 
	}
	
}
	
	

