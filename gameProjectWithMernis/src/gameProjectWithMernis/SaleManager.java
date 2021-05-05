package gameProjectWithMernis;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale, Game game, Gamer gamer) {
		System.out.println(game.nameofGame + "adlý oyundan" + sale.getNameOfcampaign() + "kampanyasýyla"
				+ gamer.getFirstName() + "adlý kullanýcý yararlandý");
	}

	@Override
	public void abortAction(Sale sale, Game game, Gamer gamer) {

		System.out.println(gamer.getFirstName() + "adlý kullanýcý" + game.nameofGame + "adlý oyunu"
				+ sale.getNameOfcampaign() + "kampanyasý satýn almayý durdurdu. ");

	}

}
