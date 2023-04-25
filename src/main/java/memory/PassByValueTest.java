package memory;

import lombok.AllArgsConstructor;
import lombok.Data;

public class PassByValueTest {

    public static Employee e1;

    public static void main(String[] args) {
        System.out.println("Employee PassByValueTest");
        employeeTest();
    }

    private static void employeeTest() {
        e1 = new Employee("Sumeet");
        method2(e1);

    }

    private static void method2(Employee e2) {
        //System.out.println(" e1 == e2 " + (e1==e2));
        Subject subject = new Subject();
        subject.initializeSubject();
    }


}

@Data
class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }
}

class Subject{

    private String name;
    private Employee emp1;


    public void testSubject(Employee emp2){
        System.out.println("1 == "+emp1 + " " + emp1.hashCode());
        System.out.println("2 == "+emp2 + " " + emp2.hashCode());
        System.out.println(emp2 == emp1);
    }

    public void initializeSubject(){
        emp1 = new Employee("Sumeet");
        testSubject(emp1);
    }


}