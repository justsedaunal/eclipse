package eTicaretKay�tGiris.core.concretes;

import eTicaretKay�tGiris.entities.concretes.User;

public class CheckUserValidator   {

	
	public static boolean checkUser(User user) {
  
		if (user.getFirstName().length()>2 && user.getLastName().length()>2 && user.getPassword().length()>6)
		{
return true;
	}
		return false ;

}
}
