package petstoreproject.petstoreapp;

public class PetHelpLineService {
	private String helplineNumber;

	public String getHelplineNumber() {
		return helplineNumber;
	}

    private static PetHelpLineService petHelpLineService=new PetHelpLineService();
    private PetHelpLineService()
    {
    	this.helplineNumber="+9173467";
    }
    public static PetHelpLineService createPetHelpLineServiceInstance()
    {
    return petHelpLineService;
    }
	

}
