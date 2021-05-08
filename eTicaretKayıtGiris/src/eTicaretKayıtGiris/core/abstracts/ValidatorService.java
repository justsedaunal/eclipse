package eTicaretKayýtGiris.core.abstracts;

import eTicaretKayýtGiris.entities.concretes.User;

public interface ValidatorService {
	boolean checkUserForEmail(User user) ;
}
