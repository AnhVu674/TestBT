package test;

import java.util.Scanner;

public class nhiPhan {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Nhap n:");
	n=Integer.parseInt(s.next());
	String kkk = "";
	while(n>0) {
		kkk=  n%2 +kkk;
		n=n/2;
	}
	System.out.println(kkk);
}
}
