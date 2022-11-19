package Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainCutomerClass {
	public static void main(String[] args) {
		// make an obj of Customer Class;
		Customer ct = new Customer(1,23,"Ram",20000);
		Customer ct1 = new Customer(2,27,"Sita",40000);
		Customer ct2 = new Customer(3,32,"David",60000);
		Customer ct3 = new Customer (4,45,"DhanBahadur",30000);

	List<Customer> CtList= new  ArrayList<Customer>(List.of(ct,ct1,ct2,ct3));
	
//	CtList.add(ct);// we can add the input in a two ways one is in above and on here in line 18;
//	CtList.add(ct1);
//	CtList.add(ct2);
//	CtList.add(ct3);
	System.out.println(CtList);

//	List<String>MyMappedName = CtList.stream().map(x->x.getName().toUpperCase()).collect(Collectors.toList());
//System.out.println(MyMappedName);}
	//lets try a reduce Function now ;
	//on line 26 we  used  reference method (customer::getSalary)
	int sum= CtList.stream().map(Customer::getSalary).reduce(0, (a,b)-> a+b);//.Collect(Collectors.toList());
	System.out.println(sum);
	}}
