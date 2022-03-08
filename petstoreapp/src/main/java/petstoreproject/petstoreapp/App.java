package petstoreproject.petstoreapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"springbeans.xml","customerconfig.xml"});
        PetStore store=(PetStore) context.getBean("petStore");
    	System.out.println(store.getStoreName());
    	System.out.println(store.getAddress());
    	
    	System.out.println("----------------------------------------------------------------------");
    	
    	PetService petService=context.getBean("petService",PetService.class);
    	System.out.println(store.getStoreName());
    	System.out.println(store.getAddress());
    	
    	System.out.println("----------------------------------------------------------------------");
    	    	
    	PetHelpLineService petservice = context.getBean("petHelpLineService",PetHelpLineService.class);
        System.out.println(petservice.getHelplineNumber());
        
        System.out.println("----------------------------------------------------------------------");
        
        /*PetFood petfood =context.getBean("petfood",PetFood.class);
        System.out.println(petfood.getFoodtype());
        System.out.println(petfood.getCalories());
        System.out.println(petfood.getQuantity());
        System.out.println("-----------------------------------------------------------------------");*/
    	
        CustomerService cservice = context.getBean("customerService",CustomerService.class);
        System.out.println(cservice.getServiceHelplineNumber());
        System.out.println(cservice.getName());
        
        System.out.println("----------------------------------------------------------------------");
    	        
        Customer cust=(Customer) context.getBean("customer");
    	System.out.println(cust.getFirstName());
    	System.out.println(cust.getLastName());
    	System.out.println(cust.getAge());
        
        System.out.println("----------------------------------------------------------------------");
    	
        PetService pService=context.getBean("pservice",PetService.class);
        List<RescueChamp> rescuechamp=pService.getRescuechamp();
        for(RescueChamp r: rescuechamp) {
        	System.out.println("-----------------------------------------------------------------------");
        	System.out.println(r.getChampName());
        	System.out.println(r.getAnimalsRescued());
        }
        }
        
    }

