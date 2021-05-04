package GameBeckEnd;

public class VerificationManager implements VerificationService {

	@Override
	public boolean confirmed(Gamer gamer) {
		if (gamer.getNationalIdentity() == "123456" && gamer.getFirstName() == "Orhan"
				&& gamer.getDateOfBirth() == "02.05.1996" && gamer.getLastName() == "yılmaz") {
			System.out.println(gamer.getFirstName() + "doğrulandı");
			return true;

		} else {
			System.out.println(gamer.getFirstName() + "doğrulanamadı");
			return false;

		}

	}

}
