package NewGradleProject;

import java.util.List;


public class PetService {
	private PetStore pStore;
	private List<RescueChamp> rescuechamp;

	public PetStore getpStore() {
		return pStore;
	}

	public void setpStore(PetStore pStore) {
		this.pStore = pStore;
	}

	public PetService(PetStore pStore) {
		super();
		this.pStore = pStore;
	}

	public PetService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<RescueChamp> getRescuechamp() {
		return rescuechamp;
	}

	public void setRescuechamp(List<RescueChamp> rescuechamp) {
		this.rescuechamp = rescuechamp;
	}

}
