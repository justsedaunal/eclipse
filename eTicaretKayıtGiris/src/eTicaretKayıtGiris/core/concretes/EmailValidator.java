package eTicaretKay�tGiris.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretKay�tGiris.core.abstracts.ValidatorService;
import eTicaretKay�tGiris.dataAccess.abstracts.UserDao;
import eTicaretKay�tGiris.entities.concretes.User;

public class EmailValidator implements ValidatorService {

	UserDao userDao;

	public EmailValidator(UserDao userDao) {
		this.userDao = userDao;

	};

	@Override
	public boolean checkUserForEmail(User user) {
		
		String regex = "[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		if (matcher.matches()) {
			for (User u : userDao.getAll()) {
				if (u.geteMail() == user.geteMail()) {
					System.out.println("Kullan�c� mevcut");
					return false;
				} else {
					return true;
				}
			}
			return false;

		} else {
			
			System.out.println("sadsad");
			return false;}
		
	}}
