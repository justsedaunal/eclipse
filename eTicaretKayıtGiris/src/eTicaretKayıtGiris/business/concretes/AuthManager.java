package eTicaretKay�tGiris.business.concretes;

import eTicaretKay�tGiris.business.abstracts.AuthService;
import eTicaretKay�tGiris.core.abstracts.GoogleService;
import eTicaretKay�tGiris.core.abstracts.LoggerService;
import eTicaretKay�tGiris.core.abstracts.ValidatorService;
import eTicaretKay�tGiris.core.check.abstracrts.CheckService;
import eTicaretKay�tGiris.core.concretes.CheckUserValidator;
import eTicaretKay�tGiris.dataAccess.abstracts.UserDao;
import eTicaretKay�tGiris.entities.concretes.User;

public class AuthManager implements AuthService {
	CheckService checkService;
	GoogleService googleService;
	UserDao userDao;
	ValidatorService validatorService;
	LoggerService loggerService;
	private User u;

	public AuthManager(GoogleService googleService, UserDao userDao) {
		this.googleService = googleService;
		this.userDao = userDao;

	}

	public AuthManager(CheckService checkService, GoogleService googleService, UserDao userDao,
			ValidatorService validatorService, LoggerService loggerService) {
		super();
		this.checkService = checkService;
		this.googleService = googleService;
		this.userDao = userDao;
		this.validatorService = validatorService;
		this.loggerService = loggerService;
	}

	
	@Override
	public boolean register(User user) {
		if (validatorService.checkUserForEmail(user) && CheckUserValidator.checkUser(user)) {
			checkService.produceCode();
			if (checkService.checkCode()) {
				loggerService.log("Kay�t ba�ar�l�");
				return true;
			} else {
				System.out.println("islem basarisiz");
				return false;
			}

		}
		return false;
	}

	@Override
	public boolean addWithGoogle(User user) {
		for (User u : userDao.getAll()) {
			if (u.geteMail() == user.geteMail()) {
				System.out.println("sadsad");
				return false;
			} else {
				if (googleService.addWithGoogle()) {
					return googleService.addWithGoogle();

				} else {
					System.out.println("asdasd");
					return false;
				}

			}

		}
		return false;

	}

	@Override
	public void login(User user) {
		for (User u : userDao.getAll())
			if (u.geteMail() == user.geteMail() && u.getPassword() == user.getPassword()) {
				System.out.println("giri� ba�ar�l�");
				break;
			} else if (u.geteMail() != user.geteMail() && u.getPassword() == user.getPassword()) {
				System.out.println("email hatal�");
			}

		if (u.geteMail() == user.geteMail() && u.getPassword() != user.getPassword()) {
			System.out.println("parola hatal�");
		}

	}
}
