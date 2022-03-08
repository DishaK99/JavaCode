package petstoreproject.petstoreapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
        Customer cust=(Customer) context.getBean("customer");
    	System.out.println(cust.getFirstName());
    	System.out.println(cust.getLastName());
    	System.out.println(cust.getAge());

	}

}
