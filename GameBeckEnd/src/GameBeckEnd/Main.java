package GameBeckEnd;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setFirstName("Orhan");
		gamer.setLastName("yýlmaz");
		gamer.setNationalIdentity("123456");
		gamer.setDateOfBirth("02.05.1996") ;
		gamer.setId(1);
		GamerManager gamerManager = new GamerManager( new VerificationManager( ));
		gamerManager.add(gamer);
		
		
		

		Game game = new Game();
		game.setNameofGame(" 'ABC' ");
		game.setId(1);
		GameManager gameManager = new GameManager();
		gameManager.add(game);

		Sale sale = new Sale();
		sale.setNameOfcampaign(" 'ABC oyununu %25 indirimle oyna!' ");
		sale.setId(1);
		SaleManager saleManager = new SaleManager();
		saleManager.add(sale, game, gamer);

		Compaign compaign = new Compaign();
		compaign.setNameOfcampaign("'ABC oyununu %25 indirimle oyna!'");
		CompaignManager compaignManager = new CompaignManager();
		compaignManager.add(compaign);

	}

}
