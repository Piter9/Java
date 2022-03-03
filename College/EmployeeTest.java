public class EmployeeTest {
	public static void main(String[] args){
		Employee kar = new Employee(11, "Fathir", "Maula", 8000);
		System.out.println(kar);

		kar.setSalary(10000);
		System.out.println(kar);

		kar.raiseSalary(50);
		System.out.println(kar);

	}
}