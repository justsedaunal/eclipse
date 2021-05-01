package paket;

public class User {
	
	
	private int id ; 
	private String name ;
	private String Email ;
	private String Password ;
	
public User() {
		
	}
	
	
	public int getId() {
		return id;
		
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
