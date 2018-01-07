package com.corejava.practice;

public class StringConcept {

	public static void main(String[] args) {
		
		//string is a collection of different characters
		String s = "The rains have started here";
		
		System.out.println("Length of the String is :"+s.length());	//27
		System.out.println("1st occurance of s is "+s.indexOf('s'));//8
		System.out.println(s.indexOf('s')+2);//10
		
		System.out.println("==========================");
		
		System.out.println("index of have "+s.indexOf("have"));	
		System.out.println("index of Have "+s.indexOf("Have"));	//-1
		System.out.println("index of Hello "+s.indexOf("Hello"));//-1		
		System.out.println("index of the is "+s.indexOf("The"));//0
		
		System.out.println("==========================");

		String s1 = "The rains Have       started   here";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));	
		
		System.out.println("==========================");

		//trim-- to remove before space and after space
		String str ="   Hello  India Team  ";
		System.out.println(str.trim());
		System.out.println("==========================");

		//replace
		String date ="01-01-2018";
		System.out.println(date.replace('-', '/'));		
		String s3 = "Hello John Sir";
		System.out.println(s3.replace(" ", "_"));
		System.out.println("==========================");

		//Sub String
		String s4 = "The rains have started here";
		System.out.println(s4.substring(0,9));
		
		System.out.println("==========================");

		//split		
		String s5 ="Hello_selenium_testing";
		String arr[]=s5.split("_");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String h ="XxTestXxxTestxxXXtest";
		String m[]=h.split("Xx");
		for(int i =0; i<m.length;i++) {
			System.out.println(i+ "===>"+m[i]);
		}
		
		String firstName ="Tom,Naveen,Felix,Ipsi,Ken";
		String firstName1[] =firstName.split(",");
		
	}

}
