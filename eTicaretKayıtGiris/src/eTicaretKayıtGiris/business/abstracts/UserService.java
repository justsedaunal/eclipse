package eTicaretKay�tGiris.business.abstracts;

import eTicaretKay�tGiris.entities.concretes.User;

public interface UserService {

	void add(User user);

	void delete(User user);
	
	void update(User user);
	
	void addWithGoogle(User user);


	
}
