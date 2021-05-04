package GameBeckEnd;

public class SaleManager implements SaleService {

	@Override

	public void add(Sale sale, Game game, Gamer gamer) {

		System.out.println(gamer.getFirstName() + " adlý kullanýcý " + game.nameofGame + " adlý oyunu "
				+ sale.getNameOfcampaign() + " kampanyasýyla satýn aldý ");

	}

	@Override
	public void abortAction(Sale sale, Game game, Gamer gamer) {

		System.out.println(gamer.getFirstName() + "adlý kullanýcý" + game.nameofGame + "adlý oyunu"
				+ sale.getNameOfcampaign() + "kampanyasý satýn almayý durdurdu. ");

	}

}
