package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterviewPrograms {
	
	public static void main(String[] args) {
		duplicatechar();
	}
	
// To find duplicate characters in String.
	public static void duplicateCharacterInString(){
		String str = "AshishSrivastava";
		str = str.toLowerCase();
		Map<Character, Integer> dupMap = new HashMap<>();
		char[] chars = str.toCharArray();
		for(Character ch : chars){
			if(dupMap.containsKey(ch)){
				dupMap.put(ch, dupMap.get(ch)+1);
			}else{
				dupMap.put(ch, 1);
			}
		}
		System.out.println(dupMap.entrySet());  
		// If want to get occurrence of all characters in String, then use till here.
		// If want to get occurrence of only duplicate characters in String, then use below also.	
		Set<Character> keys = dupMap.keySet();
		for(Character ch : keys){
			if(dupMap.get(ch)>1){
				System.out.println(ch+" --> "+dupMap.get(ch));
			}
		}
	}

	// To find duplicate characters in String.
	public static void duplicatechar(){
		String str1="SudhaMahadev";
		String str2=null;
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					str2=str2+str1.charAt(i);
				}
			}
		}
	}
	
	
// From numbers 1 to N, one number is repeating, find that number.
	public static void duplicateNumber(){
		
	}
}
