package paket;

public class Student extends User {
	

	private double PercentageOfCompletion ;
	private String JoinTheCourse ;
	private String Evaluation ;
	
	private String EditProfile;
	private String ManageTheMembership;
	private String AddCardInformationOrCahngeIt ;
	private String Connection ;
	
	private String MyCourses ;
	
public Student () {
		
	} 

	public Student(double percentageOfCompletion, String joinTheCourse, String evaluation, String email,
			String password, String editProfile, String manageTheMembership, String addCardInformationOrCahngeIt,
			String connection, String myCourses) {
		super();
		this.PercentageOfCompletion = percentageOfCompletion;
		this.JoinTheCourse = joinTheCourse;
		this.Evaluation = evaluation;
		this.EditProfile = editProfile;
		this.ManageTheMembership = manageTheMembership;
		this.AddCardInformationOrCahngeIt = addCardInformationOrCahngeIt;
		this.Connection = connection;
		this.MyCourses = myCourses;
	}
	
	

	public double getPercentageOfCompletion() {
		return PercentageOfCompletion;
	}

	public void setPercentageOfCompletion(double percentageOfCompletion) {
		PercentageOfCompletion = percentageOfCompletion;
	}

	public String getJoinTheCourse() {
		return JoinTheCourse;
	}

	public void setJoinTheCourse(String joinTheCourse) {
		JoinTheCourse = joinTheCourse;
	}

	public String getEvaluation() {
		return Evaluation;
	}

	public void setEvaluation(String evaluation) {
		Evaluation = evaluation;
	}



	public String getEditProfile() {
		return EditProfile;
	}

	public void setEditProfile(String editProfile) {
		EditProfile = editProfile;
	}

	public String getManageTheMembership() {
		return ManageTheMembership;
	}

	public void setManageTheMembership(String manageTheMembership) {
		ManageTheMembership = manageTheMembership;
	}

	public String getAddCardInformationOrCahngeIt() {
		return AddCardInformationOrCahngeIt;
	}

	public void setAddCardInformationOrCahngeIt(String addCardInformationOrCahngeIt) {
		AddCardInformationOrCahngeIt = addCardInformationOrCahngeIt;
	}

	public String getConnection() {
		return Connection;
	}

	public void setConnection(String connection) {
		Connection = connection;
	}

	public String getMyCourses() {
		return MyCourses;
	}

	public void setMyCourses(String myCourses) {
		MyCourses = myCourses;
	} 
	
	

}
