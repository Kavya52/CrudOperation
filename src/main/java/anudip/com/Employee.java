package anudip.com;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")//table name
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//primary key
	@Column(name = "eid")
	private int eid;
	@Column(name="ename")
	private String ename;
	@Column(name="age")
	private int age;
	@Column(name="exp")
	private int exp;
	
	
	
	public Employee() 
	{
		super();
	}
	
	//Setters and getters
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getExp()
	
	{
		return exp;
	}
	public void setExp(int exp)
	{
		this.exp = exp;
	}
	
	//toString method
	@Override
	public String toString()
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", exp=" + exp + "]";
	}
	
}