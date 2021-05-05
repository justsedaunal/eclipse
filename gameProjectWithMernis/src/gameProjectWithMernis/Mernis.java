package gameProjectWithMernis;

import java.rmi.RemoteException;
import java.util.Locale;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis implements AuthorServices{
	public boolean validate(Gamer gamer) throws RemoteException {
		KPSPublicSoap kpsPublicSoap= new KPSPublicSoapProxy();
		return kpsPublicSoap.TCKimlikNoDogrula(gamer.getNationalIdentity(), gamer.getFirstName().toUpperCase(new Locale("tr")), 
				gamer.getLastName().toUpperCase(new Locale("tr")) , gamer.getDateOfBirth());
	}

}
