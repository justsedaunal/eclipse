
public class Main {

	public static void main(String[] args) {
		
Course course1 = new Course (1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA+REACT)","Engin Demiroð",24);
course1.id =1 ;
course1.name ="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA+REACT)" ; 
course1.tutorial = "Engin Demiroð" ;
course1.percentageOfCompletion = 24  ;
course1.detail = "Ücretsiz" ;
course1.detail1 = "1.Gün Sonu Kayýt" ;

Course course2 = new Course ();
course2.id =2 ;
course2.name ="Programlamaya Giriþ Ýçin Temel Kurs" ; 
course2.tutorial = "Engin Demiroð" ;
course2.percentageOfCompletion = 36  ;
course2.detail = "Ücretsiz" ;
course2.detail1 = "Deðerlendirme" ;


Course [] courses = {course1,course2} ;

for (Course course : courses ) {
	System.out.println(course.name);
	
}

System.out.println(courses.length);

Category category1 = new Category () ;
category1.id = 1;
category1.name= "Kurslarým" ;

Category category2 = new Category () ;
category2.id = 2;
category2.name= "Tüm Kurslar" ;


Category category3 = new Category () ;
category3.id = 3;
category3.name= "Kampa Hazýrlýk" ;

Category category4 = new Category () ;
category4.id = 4;
category4.name= "Sýkça Sorulan Sorular" ;


CourseManager courseManager = new CourseManager ();
courseManager.joinTheCourse(course1);
courseManager.joinTheCourse(course2);
courseManager.go(course1);
courseManager.go(course2);
 
	}

}
