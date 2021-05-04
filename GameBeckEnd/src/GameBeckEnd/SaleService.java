package GameBeckEnd;

public interface SaleService {
	public void add(Sale sale, Game game, Gamer gamer);

	public void abortAction(Sale sale, Game game, Gamer gamer);

}
