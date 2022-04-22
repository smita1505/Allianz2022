package pack_employee;
import pack_employee.Employee;

public class Salary {
	
	private int basic,hra;
	private float ta;
	private boolean isOptedForNPS;
	

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public float getTa() {
		return ta;
	}

	public void setTa(float ta) {
		this.ta = ta;
	}

	public boolean getisOptedForNPS() {
		return isOptedForNPS;
	}

	public void setOptedForNPS(boolean isOptedForNPS) {
		this.isOptedForNPS = isOptedForNPS;
	}
	
	public Salary(){}
	
	public Salary(int basic, int hra, float ta, boolean isOptedForNPS){
		this.basic = basic;
		this.hra = hra;
		this.ta = ta;
		this.isOptedForNPS=isOptedForNPS;
	}
}
