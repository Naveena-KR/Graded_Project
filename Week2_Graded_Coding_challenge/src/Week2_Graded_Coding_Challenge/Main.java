package Week2_Graded_Coding_Challenge;
public class Main extends DataStructureB {
public void getEmployeeData() throws Exception{
	employeeData();
	}
public void employeeNamesSorted(){
	sortingNames();
	}
public void cityName(){
	cityNameCount();
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Main main=new Main();
        main.employeeData();//Calling this method to display employee details.
        main.sortingNames();//Calling this method to display sorted employee names.
        main.cityNameCount();//Calling this method to display number of employees from each city.
        main.monthlySalary();//Calling this method to display employees id with their salary.
	}
}
