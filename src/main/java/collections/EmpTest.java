package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Emp emp1=(Emp) applicationContext.getBean("emp1");

        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getPhones().getClass().getName());

    }
}
