package java8;

import org.testng.annotations.Test;

public class AboutString {
	String s1;

	@Test
	public void createStringLiteral(){
		s1 = "Ashish";
		System.out.println(this.s1.hashCode()+"  global");
		System.out.println(this.s1.toString()+"  global");
//		String s1 = this.s1.concat(" Srivastava");
		s1 = this.s1.concat(" Srivastava");
		System.out.println(s1.hashCode()+"  local");
		System.out.println(s1.toString()+" local");
		s1 = "Ashish";
		System.out.println(s1.hashCode()+"  local");
		System.out.println(this.s1.toString()+"  local");
		if(this.s1.equals(s1)){
			System.out.println("String value are Equal");
		}
		else{
			System.out.println("String value are not Equal");
		}
		if(this.s1==s1){
			System.out.println("Reference variable are Equal");
		}
		else{
			System.out.println("Reference variable are not Equal");
		}
	}
	
	@Test
	public void createStringNew(){
		s1 = new String("Srivastava");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
	}
	@Test
	public void createStringBuffer(){
		StringBuffer sbuffer = new StringBuffer("Ashish");
		sbuffer.append(" Srivastava");
		
	}
}
