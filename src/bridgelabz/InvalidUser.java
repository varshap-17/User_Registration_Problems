package bridgelabz;

public class InvalidUser {
	public void userEntery(Object userEntry, Object invalid) throws CustomException{
		if(userEntry==invalid) {
			throw new CustomException("Enteries is invalid");
		}else
			return;
	}
}
