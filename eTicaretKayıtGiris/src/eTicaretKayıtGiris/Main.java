package eTicaretKay�tGiris;

import eTicaretKay�tGiris.business.concretes.AuthManager;
import eTicaretKay�tGiris.business.concretes.UserManager;
import eTicaretKay�tGiris.core.check.concretes.CheckManager;
import eTicaretKay�tGiris.core.concretes.EmailLogger;
import eTicaretKay�tGiris.core.concretes.EmailValidator;
import eTicaretKay�tGiris.core.concretes.GoogleValidator;
import eTicaretKay�tGiris.dataAccess.concretes.HibernateUserDao;
import eTicaretKay�tGiris.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		
		
		
	
	

	new AuthManager(new GoogleValidator(), new HibernateUserDao());
	new User(3,"fatih","atalay","123456879", "s@sadsad.com");
	UserManager userManager= new UserManager(new AuthManager(new CheckManager(),null, new HibernateUserDao(),new EmailValidator(new HibernateUserDao()), null),new HibernateUserDao());
	UserManager userManeger2 = new UserManager(new AuthManager(new GoogleValidator(),new HibernateUserDao() ), new HibernateUserDao());

	User user = new User(1, "ckhgjh", "defgfg", "1234567", "abcdef@gmail.com");
	AuthManager authManager = new AuthManager(new CheckManager(),new GoogleValidator(),new HibernateUserDao(),
			new EmailValidator(new HibernateUserDao()),new EmailLogger());
	
		authManager.register(user);
		
		userManager.add(user);
	userManeger2.addWithGoogle(user);
		
	}
}