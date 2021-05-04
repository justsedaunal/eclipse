package GameBeckEnd;

public class Sale {

	int id;
	String nameOfcampaign;
	String nameOfGame;

	public Sale() {
	}

	public Sale(int id, String nameOfcampaign, String nameOfGame) {
		super();
		this.id = id;
		this.nameOfcampaign = nameOfcampaign;
		this.nameOfGame = nameOfGame;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfcampaign() {
		return nameOfcampaign;
	}

	public void setNameOfcampaign(String nameOfcampaign) {
		this.nameOfcampaign = nameOfcampaign;
	}

	public String getNameOfGame() {
		return nameOfGame;
	}

	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}

}
