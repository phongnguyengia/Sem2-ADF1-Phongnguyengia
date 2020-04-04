package phong;

public class EmployeeFulltime extends SalaryPolicy{
	private final float rate = 4;
	 public EmployeeFulltime() {
	       
	    }
	
	public float getSalary() {
		return rate*(super.getBaseSalary());
	}
}
