package gameProjectWithMernis;

public class Game {
	 int id ;
	 String nameofGame;
	 double price;
	
	public Game () {}
	public Game(int id, String nameofGame, double price) {
		super();
		this.id = id;
		this.nameofGame = nameofGame;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameofGame() {
		return nameofGame;
	}
	public void setNameofGame(String nameofGame) {
		this.nameofGame = nameofGame;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

}
