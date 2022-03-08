package NewGradleProject;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {
	private String accoutName;
	private Person person;
	public Account()
	{
		
	}
	public String getAccoutName() {
		return accoutName;
	}
	public void setAccoutName(String accoutName) {
		this.accoutName = accoutName;
	}
	public Person getPerson() {
		return person;
	}
	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}

}
