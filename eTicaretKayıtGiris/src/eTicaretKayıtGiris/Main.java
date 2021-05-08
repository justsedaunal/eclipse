package eTicaretKayýtGiris;

import eTicaretKayýtGiris.business.concretes.AuthManager;
import eTicaretKayýtGiris.business.concretes.UserManager;
import eTicaretKayýtGiris.core.check.concretes.CheckManager;
import eTicaretKayýtGiris.core.concretes.EmailLogger;
import eTicaretKayýtGiris.core.concretes.EmailValidator;
import eTicaretKayýtGiris.core.concretes.GoogleValidator;
import eTicaretKayýtGiris.dataAccess.concretes.HibernateUserDao;
import eTicaretKayýtGiris.entities.concretes.User;

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