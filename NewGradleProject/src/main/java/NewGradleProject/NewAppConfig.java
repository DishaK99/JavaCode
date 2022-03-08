package NewGradleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewAppConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Person person=(Person) context.getBean("person");
	    System.out.println(person.getPersonName());
		System.out.println(person.getAge());*/
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    context.scan("NewGradleProject");
	    context.refresh();
	    Person person=(Person) context.getBean("person",Person.class);
	    System.out.println(person.getPersonName());
		System.out.println(person.getAge());
	}

}
