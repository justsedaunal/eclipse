package eTicaretKay�tGiris.business.abstracts;

import eTicaretKay�tGiris.entities.concretes.User;

public interface AuthService {
	boolean register (User user) ;
	boolean addWithGoogle (User user) ;
	void login (User user) ;

}
