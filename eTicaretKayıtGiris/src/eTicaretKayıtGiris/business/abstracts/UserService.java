package eTicaretKayýtGiris.business.abstracts;

import eTicaretKayýtGiris.entities.concretes.User;

public interface UserService {

	void add(User user);

	void delete(User user);
	
	void update(User user);
	
	void addWithGoogle(User user);


	
}
