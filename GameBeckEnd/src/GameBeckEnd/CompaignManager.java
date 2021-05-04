package GameBeckEnd;

public class CompaignManager implements CompaignService {

	@Override
	public void add(Compaign compaign) {
		System.out.println("Kampanya eklendi " + compaign.getNameOfcampaign());
	}

	@Override
	public void delete(Compaign compaign) {
		System.out.println("Kampanya silindi " + compaign.getNameOfcampaign());

	}

	@Override
	public void uptade(Compaign compaign) {
		System.out.println("Kampanya güncellendi " + compaign.getNameOfcampaign());

	}

}
