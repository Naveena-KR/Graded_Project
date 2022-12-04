package Week2_Graded_Coding_Challenge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class DataStructureA extends Employee{
	public void sortingNames(){
		ArrayList<String> employeeNames=new ArrayList<String>();//Storing employee names.
		Iterator<Employee> names=employees.iterator();
		while(names.hasNext()){
			employeeNames.add((String)names.next().getName());//while iterator has next name, it will be added to employeeNames object of array list. 
		}
		Collections.sort(employeeNames);//All collected element names are sorted.
		System.out.println("\nNames of all employees in the sorted order are ");
		System.out.println(employeeNames);//displaying sorted names.
		}
	}