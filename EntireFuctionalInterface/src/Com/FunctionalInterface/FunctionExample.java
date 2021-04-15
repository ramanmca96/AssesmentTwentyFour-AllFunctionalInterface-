package Com.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	public Employee(int empID, String empName, int empAge) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpAge = empAge;
	}

	int EmpID;
	String EmpName;
	int EmpAge;
}

public class FunctionExample {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(101, "Rishi", 26));
		list.add(new Employee(102, "Ragav", 30));
		list.add(new Employee(108, "Bhargav", 32));
		list.add(new Employee(102, "JD", 40));
		list.add(new Employee(102, "Sakthi", 60));
		list.add(new Employee(102, "Raaja", 67));
		list.add(new Employee(102, "WillSmith", 50));
		list.add(new Employee(102, "Decaprio", 55));
		list.add(new Employee(102, "TomHanks", 70));

		

		List<Employee> collect = list.stream().filter((a) -> (a.EmpAge > 50)).collect(Collectors.toList());

		for (Employee employee : collect) {

			System.out.println("Employee ID IS :" + employee.EmpID + "  " + "Employee Name IS:" + "  "
					+ employee.EmpName + "  " + "Employee Age IS:" + employee.EmpAge);

		}
		
		System.out.println("   " );
		Employee EmpListMin = list.stream().min((a, b) -> a.EmpAge > a.EmpAge ? 1 : -1).get();
		System.out.println("Younger Employee:");
		System.out.println("Employee ID IS :" + EmpListMin.EmpID + "  " + "Employee Name IS:" + "  "
				+ EmpListMin.EmpName + "  " + "Employee Age IS:" + EmpListMin.EmpAge);
		System.out.println("  ");

		Employee EmpListMax = list.stream().max((a, b) -> a.EmpAge > a.EmpAge ? 1 : -1).get();
		System.out.println("Oldest Employee:");
		System.out.println("Employee ID IS :" + EmpListMax.EmpID + "  " + "Employee Name IS:" + "  "
				+ EmpListMax.EmpName + "  " + "Employee Age IS:" + EmpListMax.EmpAge);

	};

}
