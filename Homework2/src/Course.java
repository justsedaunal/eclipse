
public class Course {
	
	public Course () {
	System.out.println("kurslar") ;
	}
	
	
	public Course (int id,String name, String tutorial, double percentageOfCompletion) 
	{	
		this () ;
		this.id= id;
		this.name = name ;
		this.tutorial = tutorial ;
	
		this.percentageOfCompletion = percentageOfCompletion ;
	}	
	int id ;
	String name ;
	String tutorial ;
	double percentageOfCompletion ;
	String detail ;
	String detail1 ;
		
	
	}
	


