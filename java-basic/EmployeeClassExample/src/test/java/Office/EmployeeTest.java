package Office;

//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by junjaytan on 3/3/16.
 */

public class EmployeeTest {

    @Test
    public void setEmployee(){
      /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        // empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        // empTwo.printEmployee();
    }

    @Test
    public void setAndReturnEmployee(){
        /* Create two objects using constructor */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);

        // System.out.println("empOne age:" + empOne.age);
        Assert.assertEquals("empOne age is set", empOne.age, 26);
        Assert.assertEquals("empOne designation is set", empOne.designation, "Senior Software Engineer");
        // checking double data type requires form: (expected, actual, delta)
        Assert.assertEquals(empOne.salary, 1000, 0);

    }
}
