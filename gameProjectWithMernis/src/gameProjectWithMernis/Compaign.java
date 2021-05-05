package gameProjectWithMernis;

public class Compaign {
	private int id;
	private String nameOfcampaign;
	private String discount;
	
	public Compaign () {
		
	}
	public Compaign(int id, String nameOfcampaign, String discount) {
		super();
		this.id = id;
		this.nameOfcampaign = nameOfcampaign;
		this.discount = discount;
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
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	
}
