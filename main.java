package odev_2;

public class main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1 , "Yaz�l�m Geli�tirme Kamp� ( C# + ANGULAR )", "Engin DEMIROG"); 
		Course course2 = new Course(2 , "Yaz�l�m Geli�tirme Kamp� ( JAVA + REAC )", "Engin DEMIROG"); 
		Course course3 = new Course(3 , "Yaz�l�m Geli�tirme Kamp� ( Programlamaya Giri� i�in Temel Kurs )", "Engin DEMIROG"); 
		
		Course [] courses = new Course [] {
				course1,
				course2,
				course3,	
		};
			for (Course course:courses) {
				System.out.println("Kurs Id:" + course.id);
				System.out.println("Kurs Ad�:" + course.courseName);
				System.out.println("Kurs E�itmeni:" + course.instructor);
			}
		
			CourseManager courseManager = new CourseManager ();
				courseManager.kayitOl(course1);
				courseManager.kayitOl(course2);
				courseManager.kayitOl(course3);
			}
			
	}


