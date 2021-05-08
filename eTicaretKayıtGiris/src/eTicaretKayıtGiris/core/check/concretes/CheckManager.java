package eTicaretKayýtGiris.core.check.concretes;

import eTicaretKayýtGiris.core.check.abstracrts.CheckService;

public class CheckManager implements CheckService{

	@Override
	public void produceCode() {
String code ="https://www.giris-9617" ;	
System.out.println("linkiniz:"+ " " + code);
	}
	@Override
	public boolean checkCode() {
		// TODO Auto-generated method stub
		return false;
	}

}
