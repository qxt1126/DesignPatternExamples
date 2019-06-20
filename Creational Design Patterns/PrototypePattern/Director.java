package PrototypePattern;

public abstract class Director implements Cloneable {
	   
	   private String name;
	   protected String department;
	   
	   abstract void directorInfo();
	   
	   public String getDepartment(){
	      return department;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
	}
