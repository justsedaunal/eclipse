package paket;


public class UserManager { 
	
public void signin (User user) {
		
		System.out.println(user.getName() + " Giriş Yapıldı "); }
		
public void signout (User user) {
			
		
		System.out.println(user.getName() + " Çıkış yapıldı ");
		

}
public void add (User user)  {
	System.out.println(user.getName()+ " eklendi . ");
}
public void addMultiple (User  [] users ) {
	for (User user : users) {
		add(user) ;		} } }