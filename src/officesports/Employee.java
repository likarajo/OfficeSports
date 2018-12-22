package officesports;

import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "employee")

public class Employee { 
	   private int id; 
	   private String fname;
	   private String lname;
	     
	   public Employee(){} 
	    
	   public Employee(int id, String fname, String lname){  
	      this.id = id; 
	      this.fname = fname; 
	      this.lname = lname; 
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getFName() { 
	      return fname; 
	   } 
	   @XmlElement
	   public void setFName(String fname) { 
	      this.fname = fname; 
	   } 
	   public String getLName() { 
		  return lname; 
	   } 
	   @XmlElement
	   public void setLName(String lname) { 
		  this.lname = fname; 
	   }    
	} 
