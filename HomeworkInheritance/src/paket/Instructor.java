package paket;

public class Instructor extends User {
	
	private String Biography ;
	private String Homework ;
	
	public Instructor () {
		
	}

	public Instructor(String biography, String homework) {
		super();
		Biography = biography;
		Homework = homework;
	}

	public String getBiography() {
		return Biography;
	}

	public void setBiography(String biography) {
		Biography = biography;
	}

	public String getHomework() {
		return Homework;
	}

	public void setHomework(String homework) {
		Homework = homework;
	}
 ;
 
	
	
	

}
