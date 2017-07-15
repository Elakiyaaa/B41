package GUVI;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.next();
String b=new StringBuffer(a).reverse().toString();
System.out.println(b);
String c=b.replaceAll("[AEIOUaeiou]","");
System.out.println(c);
	}

}
