package GameBeckEnd;

public class SaleManager implements SaleService {

	@Override

	public void add(Sale sale, Game game, Gamer gamer) {

		System.out.println(gamer.getFirstName() + " adl� kullan�c� " + game.nameofGame + " adl� oyunu "
				+ sale.getNameOfcampaign() + " kampanyas�yla sat�n ald� ");

	}

	@Override
	public void abortAction(Sale sale, Game game, Gamer gamer) {

		System.out.println(gamer.getFirstName() + "adl� kullan�c�" + game.nameofGame + "adl� oyunu"
				+ sale.getNameOfcampaign() + "kampanyas� sat�n almay� durdurdu. ");

	}

}
