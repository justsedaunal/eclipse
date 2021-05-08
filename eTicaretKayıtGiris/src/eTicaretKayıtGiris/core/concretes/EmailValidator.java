package eTicaretKayýtGiris.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretKayýtGiris.core.abstracts.ValidatorService;
import eTicaretKayýtGiris.dataAccess.abstracts.UserDao;
import eTicaretKayýtGiris.entities.concretes.User;

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
					System.out.println("Kullanýcý mevcut");
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
