package eTicaretKay�tGiris.core.concretes;

import eTicaretKay�tGiris.core.abstracts.LoggerService;
import eTicaretKay�tGiris.logger.LoggerManager;

public class EmailLogger implements LoggerService{

	@Override
	public void log(String message) {
		
		 LoggerManager loggerManager = new LoggerManager();	
		 loggerManager.log(message);
		
	}

}
