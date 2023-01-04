package randoms;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
        String s2=sc.nextLine();
       
        boolean res=anagram(s1,s2);
        if(res==true) {
        	System.out.println("Anagrams");
        }else {
        	System.out.println("Not Anagrams");
        }

	}
	public static boolean anagram(String a,String b) {
		boolean result=false;
		
		char[] str1=a.toUpperCase().toCharArray();
		char[] str2=b.toUpperCase().toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(str1.length == str2.length) {
			result=Arrays.equals(str1,str2);
		}
		
		return result;
	}

}
