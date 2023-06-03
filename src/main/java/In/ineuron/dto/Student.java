package In.ineuron.dto;

import java.io.Serializable;


public class Student implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sid;
	private String sname;
	private int sage;
	private String saddr;
	
	
	
	
	static {
		System.out.println("Student.class is loading....");
	}
	public Student() {
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddr=" + saddr + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	
	
	
	
	
	
	
}
 