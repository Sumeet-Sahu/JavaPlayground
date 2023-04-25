package experiments;

public class InterfaceConstant {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.changeStaticFromBase();
        t1.display();

        Test t2 = new Test();
        t2.display();
    }
}


interface I1 {
    MyEmployee emp = new MyEmployee();//"Sumeet", new Date());
}

interface I2 {

}

interface I3 extends I1, I2 {

}


class Test implements I1 {

    public void changeStaticFromBase() {
        emp.name = "Akshay";
    }

    public void display() {
        System.out.println(emp);
    }

}

class TestAgain implements I1 {

    public void display() {
        System.out.println(emp);
    }
}

