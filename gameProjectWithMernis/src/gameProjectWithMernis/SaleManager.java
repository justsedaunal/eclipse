package gameProjectWithMernis;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale, Game game, Gamer gamer) {
		System.out.println(game.nameofGame + "adl� oyundan" + sale.getNameOfcampaign() + "kampanyas�yla"
				+ gamer.getFirstName() + "adl� kullan�c� yararland�");
	}

	@Override
	public void abortAction(Sale sale, Game game, Gamer gamer) {

		System.out.println(gamer.getFirstName() + "adl� kullan�c�" + game.nameofGame + "adl� oyunu"
				+ sale.getNameOfcampaign() + "kampanyas� sat�n almay� durdurdu. ");

	}

}
