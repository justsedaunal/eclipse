package eTicaretKayýtGiris.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKayýtGiris.dataAccess.abstracts.UserDao;
import eTicaretKayýtGiris.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	ArrayList<User> users;

	public HibernateUserDao() {
		this.users = new ArrayList<User>();
		User user = new User(1, "a", "1", "1234", "s@sadsad.com");
		User user1 = new User(2, "seda", "yýlmaz", "12356546", "asdas@sadsad.com");
		users.add(user);
		users.add(user1);
	}

	@Override
	public void add(User user) {

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void uptade(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
