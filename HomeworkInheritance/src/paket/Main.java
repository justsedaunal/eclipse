package paket;


public class Main {

	public static void main(String[] args) {
		
		Student student = new Student ( ) ;
		student.setId(1);
		student.setName("Merve y�lmaz");
		student.setEmail("123456@gmail.com");
		student.setEditProfile("Nalan");
		student.setPassword("25522");
		
		
		Instructor instructor = new Instructor () ;
		instructor.setBiography("Yaz�l�m geli�tirmeye lisede yaz�l�m b�l�m�nde okurken ba�lad�m.�niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m. S�ras�yla Ba�kent ve ODT� de Y�netim Bili�im Sistemleri (Lisans-Burslu) ve T�p Bili�imi(Y�ksek Lisans) okudum. Profesyonel i� hayat�ma ise hen�z �niversite birinci s�n�ftayken ba�lad�m.A��rl�kl� olarak Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k veriyorum.Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalar�na sahibim.Engin Demiro� YouTube kanal�mda �cretsiz e�itim videolar� ve i�erikleri payla�maktay�m.Dan��manl�k yapt���m kurumlar�n baz�lar� : Merkez Bankas�,TAI, Birle�mi� Milletler,NATO,�� Bankas�, Akbank, Halkbank, Vak�fbank, Yap� Kredi Bankas�, Ziraat Bankas�, Emniyet, Ba�bakanl�k, Cumhurba�kanl���, Hazine M�ste�arl���, Maliye Bakanl���, Tar�m Bakanl���, T�bitak.Dan��manl�k veya e�itim verdi�im kurum say�s� son 10 y�lda 300 � ge�mi�tir.DevFramework ismiyle geli�tirdi�im altyap� projem bir�ok kurum ve firmada yaz�l�m geli�tirme altyap�s� olarak kullan�lmaktad�r.");
		
			
		StudentManager studentManager1 = new StudentManager () ;
		studentManager1.add(student);
	

			User Seda = new User () ;
			Seda.setName("Seda");
			
			

            Instructor EnginDemirog = new Instructor ();
            EnginDemirog.setName("Engin Demiro�")	;
			
		
			
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
