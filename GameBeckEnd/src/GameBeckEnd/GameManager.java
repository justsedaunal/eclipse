package GameBeckEnd;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {

		System.out.println("Oyun eklendi " + game.getNameofGame());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi " + game.getNameofGame());

	}

	@Override
	public void uptade(Game game) {
		System.out.println("Oyun güncellendi " + game.getNameofGame());

	}

}
