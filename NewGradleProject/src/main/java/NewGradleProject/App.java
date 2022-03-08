package NewGradleProject;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"springbeans.xml","customerconfig.xml"});
        PetStore store=(PetStore) context.getBean("petStore");
    	System.out.println(store.getStoreName());
    	System.out.println(store.getAddress());
    	
    	System.out.println("----------------------------------------------------------------------");
    	
        
	}

}
