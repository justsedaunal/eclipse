package GameBeckEnd;

public class GamerManager implements GamerService {

	private VerificationService verificationService;

	public GamerManager(VerificationService verificationservice) {
		this.verificationService = verificationservice;
	}

	@Override
	public void add(Gamer gamer) {
		if (this.verificationService.confirmed(gamer)) {

			System.out.println("Oyuncu eklendi " + gamer.getFirstName());
		}

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu eklendi " + gamer.getFirstName());

	}

	@Override
	public void uptade(Gamer gamer) {
		System.out.println("Oyuncu güncellendi " + gamer.getFirstName());

	}

}
