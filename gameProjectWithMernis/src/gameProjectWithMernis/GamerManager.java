package gameProjectWithMernis;

public class GamerManager implements GamerServices{
	AuthorServices authorservice ;

	public GamerManager(AuthorServices authorservice) {
		this.authorservice = authorservice;
	}

	public void register(Gamer gamer) throws Exception {
		if (authorservice.validate(gamer)) {
			System.out.println("Doðrulama Baþarýlý");
			
		}else {
			throw new Exception();
		}
	}

}
