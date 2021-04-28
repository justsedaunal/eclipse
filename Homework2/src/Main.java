
public class Main {

	public static void main(String[] args) {
		
Course course1 = new Course (1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA+REACT)","Engin Demiro�",24);
course1.id =1 ;
course1.name ="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA+REACT)" ; 
course1.tutorial = "Engin Demiro�" ;
course1.percentageOfCompletion = 24  ;
course1.detail = "�cretsiz" ;
course1.detail1 = "1.G�n Sonu Kay�t" ;

Course course2 = new Course ();
course2.id =2 ;
course2.name ="Programlamaya Giri� ��in Temel Kurs" ; 
course2.tutorial = "Engin Demiro�" ;
course2.percentageOfCompletion = 36  ;
course2.detail = "�cretsiz" ;
course2.detail1 = "De�erlendirme" ;


Course [] courses = {course1,course2} ;

for (Course course : courses ) {
	System.out.println(course.name);
	
}

System.out.println(courses.length);

Category category1 = new Category () ;
category1.id = 1;
category1.name= "Kurslar�m" ;

Category category2 = new Category () ;
category2.id = 2;
category2.name= "T�m Kurslar" ;


Category category3 = new Category () ;
category3.id = 3;
category3.name= "Kampa Haz�rl�k" ;

Category category4 = new Category () ;
category4.id = 4;
category4.name= "S�k�a Sorulan Sorular" ;


CourseManager courseManager = new CourseManager ();
courseManager.joinTheCourse(course1);
courseManager.joinTheCourse(course2);
courseManager.go(course1);
courseManager.go(course2);
 
	}

}
