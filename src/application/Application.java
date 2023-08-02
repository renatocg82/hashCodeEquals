package application;

import entities.Client;

public class Application {

	public static void main(String[] args) {

		Client c1 = new Client("Renato", "renato@gmail.com");
		Client c2 = new Client("Isabel", "isabel@hotmail.com");
		Client c3 = new Client("Renato", "renato@gmail.com");

		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c3.hashCode());

		System.out.println(c1.equals(c3));

		System.out.println(c1 == c3);

		c1 = c3;

		System.out.println(c1 == c3);
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		

		/*
		 * String a = "Maria"; String b = "Alex"; String c = "Maria"; String d;
		 * 
		 * System.out.println(a.equals(b)); System.out.println(a.equals(c));
		 * 
		 * System.out.println(a.hashCode()); System.out.println(b.hashCode());
		 * System.out.println(c.hashCode());
		 */

	}

}
