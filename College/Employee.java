public class Employee{
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
    private int percent;
	
	public Employee(int id, String firstname, String lastname, int salary){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	public int getID(){
		return id;
	}
	
	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public String getname(){
		return firstname+" "+lastname;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public int setSalary(int salary){
		return this.salary = salary;
	}
	
	public int getAnnualSalary(){
		return salary*12;
	}
	
	public int raiseSalary(int percent){
		this.salary = (100+percent)*salary/100;
        return salary;
	}
	
	public String toString(){
		return "Employee[id=" + id +", name=" + firstname + " " + lastname + ", salary=" + salary +"]";
    }
}