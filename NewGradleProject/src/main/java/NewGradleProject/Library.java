/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package NewGradleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args)
    {
         ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
         Person person=(Person) context.getBean("person");
         System.out.println(person.getPersonName());
         System.out.println("==================================================================");
         
         Payment payment = context.getBean("payment",Payment.class);
         System.out.println(payment.getAmount());
         System.out.println(payment.getPhoneno());
         System.out.println(payment.getPerson().getPersonName());
         System.out.println("==================================================================");
    }
}
