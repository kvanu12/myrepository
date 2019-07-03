package first;
 
import java.awt.List;

public class ArrayList {

	
	public static String s1;

	static class Student{
		int rollno;
		int eng,social,phy;
		String name;
		int marks1 = eng;
		int marks2 = social;
		int marks3 = phy;
		int t = marks1+marks2+marks3;
	Student(int rollno,String name,int eng,int social,int phy,int marks,int t){
		{
			this.rollno = rollno;
			this.name = name;
			this.marks1 = eng;
			this.marks2 = social;
			this.marks3 = phy;
			this.t = t;
	}
		

	}		
	public Student(int rollno, String name, int marks1, int marks2, int marks3, int t) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "vijay", 34, 35, 56, t= 125   );
		Student s2 = new Student(102, "harry", 35, 45, 56, t= 136  );
		
	
		
		
		List<Student> a1 = new ArrayList<Student>();
		
		
		
		
		
		
	}
	}
}