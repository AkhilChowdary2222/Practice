package com.klu.model;
import javax.persistence.*;

@Entity
@Table(name="dept")
public class Department {
	
	@Id
	@GenetatedValue(Strategy=GenerationType.IDENTITY)
   private int deptid;
   private String deptname;
   public void setDeptId(int depid)
   {
	   this.deptid=deptid;
   }
   public int getDeptId(){
	   return deptid;
   }
   public void setDeptName(String deptname)
   {
	   this.deptname=deptname;
	   
   }
   {
	   this.deptid=deptid;
   
}
}
