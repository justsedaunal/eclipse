package eTicaretKay�tGiris.dataAccess.abstracts;

import java.util.List;

import eTicaretKay�tGiris.entities.concretes.User;

public interface UserDao {
	
	void add(User user);

	void delete(User user);

	void uptade(User user);


	List<User> getAll();
}