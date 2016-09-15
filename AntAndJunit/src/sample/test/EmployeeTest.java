package sample.test;

import junit.framework.TestCase;
import sample.java.Employee;
/**
 * 
 * @author Kannan Thangadurai
 *
 */
public class EmployeeTest extends TestCase{
	
	public void testGetEmployeeName(){
		Employee employee=new Employee();
		employee.setFirstName("Kannan");
		employee.setSecondName("Thangadurai");
		assertEquals("Kannan", employee.getFirstName());
		assertEquals("Thangadurai", employee.getSecondName());
		
		Employee employee1=new Employee();
		employee1.setFirstName(null);
		employee1.setSecondName("");
		assertEquals(null, employee1.getFirstName());
		assertEquals("", employee1.getSecondName());
		
		Employee employee2=new Employee();
		employee2.setFirstName("");
		employee2.setSecondName(null);
		assertEquals("", employee2.getFirstName());
		assertEquals(null, employee2.getSecondName());

	}

}
