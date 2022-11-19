package Customer;

public class Customer {
	int id ;
	int age;
	String name;
	int salary;

public Customer () {
	
}
public Customer (int id, int age , String name, int salary) {
	this.id= id;
	this.age= age;
	this.name= name;
	this.salary= salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
}

}
