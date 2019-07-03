package com.collections.examples;
import java.util.ArrayList;
import java.util.List;  // It is not java.awt.list but java.util.List for collections

public class ArrayListExample {

	public static void main(String[] args) {
		Student s1 = new Student(101, "vijay", 34, 35, 56);
		Student s2 = new Student(102, "harry", 35, 45, 56);
		
		List<Student> alist = new ArrayList<Student>();
	
		//Adding students to ArrayList
		alist.add(s1);
		alist.add(s2);
		
		System.out.println(alist.get(0).rollno+"   "+alist.get(0).name+"   "+alist.get(0).marksInEnglish+"   "+alist.get(0).marksInSocial+"   "+alist.get(0).marksInPhy+"   "+alist.get(0).total);
		System.out.println(alist.get(1).rollno+"   "+alist.get(1).name+"   "+alist.get(1).marksInEnglish+"   "+alist.get(1).marksInSocial+"   "+alist.get(1).marksInPhy+"   "+alist.get(1).total);
	}

}




