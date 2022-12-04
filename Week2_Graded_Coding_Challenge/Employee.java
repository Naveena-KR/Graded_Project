package Week2_Graded_Coding_Challenge;
import java.util.ArrayList;
public class Employee{//
	 int id; 
	 String name; 
	 int age; 
	 int salary; // per annum 
	 String department; 
	 String city;
	Employee(String n,int a,int s,String d,String c){
		name=n;
		age=a;
		salary=s;
		department=d;
		city=c;
	}	
	public Employee() {
		super();
	}
	ArrayList<Employee> employees = new ArrayList<>();//This array list stores all employees data
	public void employeeData() throws Exception{
		Employee e1=new Employee("Naveena",22,1200000,"BSD","Bengaluru");
		e1.setId(500);//Setting id for employee e1
		Employee e2=new Employee("Kerthan",25,800000 ,"HR","Delhi");
		e2.setId(501);//Setting id for employee e2
		Employee e3=new Employee("Karthik",18,400000 ,"IT","Mysore");
		e3.setId(503);//Setting id for employee e3
		Employee e4=new Employee("Ankitha",24,1500000,"Admin","Delhi");
		e4.setId(504);//Setting id for employee e4
		Employee e5=new Employee("Praveen",23,1300000,"HR","Bengaluru");
		e5.setId(505);//Setting id for employee e5
		employees.add(e1);//Each employee data added to the employees object
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println("List of employees");
		for(Employee emp:employees){//For each employee,the data will be displayed
			System.out.println(emp.getId()+" "+emp.name+" "+emp.age+" "+emp.salary+" "+emp.department+" "+emp.city);
			try {//When any employee data contains null or <0 values, try block throws an exception 
			if(emp.getId()<0 ||emp.getName()==null ||emp.getAge()<0 
			   ||emp.getAge()<0||emp.getDepartment()==null||emp.city==null){
				throw new Exception("null or <0 value is occured");
				}
			}
			catch(Exception e){//catch block displays exception message
				System.out.println(e);
			}		
		}
	}
	//Setters and getters are used to set or get element data of employees
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public String getCity() {
		return city;
	}
}
	
		
		
		
	
	




	

