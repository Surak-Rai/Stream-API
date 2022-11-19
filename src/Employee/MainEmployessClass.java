package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEmployessClass {
	public static void main(String[] args) {
		// make an object of Class

		MyEmployee emp = new MyEmployee(2, "Suman", 32);
		MyEmployee emp1 = new MyEmployee(3, "David", 24);
		MyEmployee emp2 = new MyEmployee(7, "Ram", 33);
		MyEmployee emp3 = new MyEmployee(8, "Dev", 45);

		List<MyEmployee> empList = new ArrayList<MyEmployee>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		System.out.println(empList);
		// We will use a fuctions of Stream Api called filter here to get the employee
		// who are older than 30 year;
		List<MyEmployee> FilteredAge = empList.stream().filter(x -> x.getAge()>30).collect(Collectors.toList());
		System.out.println("Age Older Than 30: " +FilteredAge);
	}

}
