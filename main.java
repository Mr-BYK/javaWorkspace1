package odev_2;

public class main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1 , "Yazýlým Geliþtirme Kampý ( C# + ANGULAR )", "Engin DEMIROG"); 
		Course course2 = new Course(2 , "Yazýlým Geliþtirme Kampý ( JAVA + REAC )", "Engin DEMIROG"); 
		Course course3 = new Course(3 , "Yazýlým Geliþtirme Kampý ( Programlamaya Giriþ için Temel Kurs )", "Engin DEMIROG"); 
		
		Course [] courses = new Course [] {
				course1,
				course2,
				course3,	
		};
			for (Course course:courses) {
				System.out.println("Kurs Id:" + course.id);
				System.out.println("Kurs Adý:" + course.courseName);
				System.out.println("Kurs Eðitmeni:" + course.instructor);
			}
		
			CourseManager courseManager = new CourseManager ();
				courseManager.kayitOl(course1);
				courseManager.kayitOl(course2);
				courseManager.kayitOl(course3);
			}
			
	}


