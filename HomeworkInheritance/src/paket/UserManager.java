package paket;


public class UserManager { 
	
public void signin (User user) {
		
		System.out.println(user.getName() + " Giri� Yap�ld� "); }
		
public void signout (User user) {
			
		
		System.out.println(user.getName() + " ��k�� yap�ld� ");
		

}
public void add (User user)  {
	System.out.println(user.getName()+ " eklendi . ");
}
public void addMultiple (User  [] users ) {
	for (User user : users) {
		add(user) ;		} } }