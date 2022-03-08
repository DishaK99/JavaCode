package NewGradleProject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class ApplicationConfiguration {
	@Bean("person")
	public Person getPerson()
	{
		Person obj=new Person();
		obj.setPersonName("Disha Kale");
		obj.setAge(22);
		return obj;
		}

}
