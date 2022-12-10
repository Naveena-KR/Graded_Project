package Week2_Graded_Coding_Challenge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class DataStructureB extends DataStructureA{
	public void cityNameCount(){
		ArrayList<String> cityNames=new ArrayList<String>();//Storing each employee city names.
		Iterator<Employee> iterCityNames=employees.iterator();
		while(iterCityNames.hasNext()){
			cityNames.add((String)iterCityNames.next().getCity());
		}
		System.out.println("\nCount of Employees from each city ");
		Map<String, Long> cityCount =cityNames.stream().collect(Collectors.groupingBy
				                     (e -> e, Collectors.counting()));/*If same city 
		found in list, Mapping counts the city's and added to array list.*/
		System.out.println(cityCount);//Displaying city's with no.of employees from each city.
	}
	public void monthlySalary() {
		try{
		TreeMap<Integer,Long> monthlySalary=new TreeMap<Integer, Long>();
		for(Employee eee:employees) {
			monthlySalary.put(eee.getId(),(long)eee.getSalary());//Putting gets employee Id with their salary and adds to array list.	
		}
		System.out.println("\nMonthly Salary of employee along with their id is");
		System.out.println(monthlySalary);
		}
		catch(Exception e){
			System.out.println(e);//Displaying employee id along with salary.
		}
	}
}
