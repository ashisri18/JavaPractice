package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class StringPrograms {
	
	String[] input;
	static int strLength = 0;
	public static void main(String[] args) {
		 Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		      
		  ArrayList<Student> al=new ArrayList<Student>();//creating arraylist  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		    
		  Iterator<Student> itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }  
	}
class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
}  
	
	/*public void arrayString(String[] strarry){
		input = new String[]{"Ashish", "Himanshu", "Yashi", "Vinay", "Jeevraj", "Raghu", "Lakshmi", "Kerthana", "Ibrahim"};
		Map <Integer, String[]> map = new HashMap<>();
		String[] arrayValues = new String[];
		for(int i=0; i<input.length; i++){
			strLength = input[i].length();
			if(!( map.containsKey(strLength))){
				map.put(strLength, input);
			}else{
				
			}
			
		}
	}*/
	
	public void aboutString(){
		String s1 = "Ashish";
		System.out.println(s1);
		s1 = s1.concat("Sudha");
		System.out.println(s1);
	}
 
}
