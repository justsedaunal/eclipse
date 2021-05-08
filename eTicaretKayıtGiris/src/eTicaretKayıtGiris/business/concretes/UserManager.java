package eTicaretKay�tGiris.business.concretes;

import eTicaretKay�tGiris.business.abstracts.AuthService;
import eTicaretKay�tGiris.business.abstracts.UserService;
import eTicaretKay�tGiris.dataAccess.abstracts.UserDao;
import eTicaretKay�tGiris.entities.concretes.User;

public class UserManager implements UserService {
	AuthService authService ;
	UserDao userDao ;


	public UserManager(AuthService authService, UserDao userDao) {
		super();
		this.authService = authService;
		this.userDao = userDao;
	}

	

	@Override
	public void add(User user) {
if (authService.register(user))	{
	userDao.add(user);
	}	
}
	

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addWithGoogle(User user) {
		if (authService.addWithGoogle(user))	{
			userDao.add(user);
			}	
		}	
	}

	