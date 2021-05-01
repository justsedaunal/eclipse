package paket;


public class Main {

	public static void main(String[] args) {
		
		Student student = new Student ( ) ;
		student.setId(1);
		student.setName("Merve yýlmaz");
		student.setEmail("123456@gmail.com");
		student.setEditProfile("Nalan");
		student.setPassword("25522");
		
		
		Instructor instructor = new Instructor () ;
		instructor.setBiography("Yazýlým geliþtirmeye lisede yazýlým bölümünde okurken baþladým.Üniversite hayatýma ÖSS 2003 Türkiye derecesiyle baþladým. Sýrasýyla Baþkent ve ODTÜ de Yönetim Biliþim Sistemleri (Lisans-Burslu) ve Týp Biliþimi(Yüksek Lisans) okudum. Profesyonel iþ hayatýma ise henüz üniversite birinci sýnýftayken baþladým.Aðýrlýklý olarak Savunma Sanayisi, Bankacýlýk sektörlerine kurumsal yazýlým geliþtirme süreçleri konusunda danýþmanlýk veriyorum.Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahibim.Engin Demiroð YouTube kanalýmda ücretsiz eðitim videolarý ve içerikleri paylaþmaktayým.Danýþmanlýk yaptýðým kurumlarýn bazýlarý : Merkez Bankasý,TAI, Birleþmiþ Milletler,NATO,Ýþ Bankasý, Akbank, Halkbank, Vakýfbank, Yapý Kredi Bankasý, Ziraat Bankasý, Emniyet, Baþbakanlýk, Cumhurbaþkanlýðý, Hazine Müsteþarlýðý, Maliye Bakanlýðý, Tarým Bakanlýðý, Tübitak.Danýþmanlýk veya eðitim verdiðim kurum sayýsý son 10 yýlda 300 ü geçmiþtir.DevFramework ismiyle geliþtirdiðim altyapý projem birçok kurum ve firmada yazýlým geliþtirme altyapýsý olarak kullanýlmaktadýr.");
		
			
		StudentManager studentManager1 = new StudentManager () ;
		studentManager1.add(student);
	

			User Seda = new User () ;
			Seda.setName("Seda");
			
			

            Instructor EnginDemirog = new Instructor ();
            EnginDemirog.setName("Engin Demiroð")	;
			
		
			
			UserManager userManager = new UserManager() ;
			
			
			User [] users = {Seda, EnginDemirog} ;
			
			userManager.addMultiple(users);
			
			

			EnginDemirog.setHomework("Homework");
			
			
			InstructorManager instructorManager = new InstructorManager () ;
			instructorManager.add(EnginDemirog);
			instructorManager.addBiography(instructor);
			
		    Student seda1 = new Student ();
            seda1.setName("Seda1");
            seda1.setEmail("sedaylzm21@gmail.com"); 
            seda1.setPassword("5620321");
            
            
			
//           StudentManager studentmanager = new StudentManager();
//           studentmanager.add(seda1);
//           
           
			
           
           
         
           
           
           
           
			
	}

}
