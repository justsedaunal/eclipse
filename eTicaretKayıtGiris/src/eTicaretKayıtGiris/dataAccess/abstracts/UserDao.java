package eTicaretKayýtGiris.dataAccess.abstracts;

import java.util.List;

import eTicaretKayýtGiris.entities.concretes.User;

public interface UserDao {
	
	void add(User user);

	void delete(User user);

	void uptade(User user);


	List<User> getAll();
}