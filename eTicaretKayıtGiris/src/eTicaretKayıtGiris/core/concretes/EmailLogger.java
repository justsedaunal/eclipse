package eTicaretKayýtGiris.core.concretes;

import eTicaretKayýtGiris.core.abstracts.LoggerService;
import eTicaretKayýtGiris.logger.LoggerManager;

public class EmailLogger implements LoggerService{

	@Override
	public void log(String message) {
		
		 LoggerManager loggerManager = new LoggerManager();	
		 loggerManager.log(message);
		
	}

}
