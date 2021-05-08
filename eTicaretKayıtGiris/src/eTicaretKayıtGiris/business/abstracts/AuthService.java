package eTicaretKayýtGiris.business.abstracts;

import eTicaretKayýtGiris.entities.concretes.User;

public interface AuthService {
	boolean register (User user) ;
	boolean addWithGoogle (User user) ;
	void login (User user) ;

}
