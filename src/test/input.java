package test;
import java.util.Scanner;
public class input {
	String name;
	int age;
	float points;
	void nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap ten cua bạn:");
		name = ip.nextLine();
		System.out.println("Nhap tuoi cua bạn:");
		age = Integer.parseInt(ip.nextLine());
		System.out.println("Nhap diem cua bạn:");
		points = Float.parseFloat(ip.nextLine());
		ip.close();
				
	}
	 void xuat(){
	        System.out.print("  ---- Thong tin vua nhap: ----");
	        System.out.println("\nHo va ten: "+name +"\n Tuoi: "+ age +"\n Diem: "+points);
	    } 
	
 public static void main(String[] args) {
	input a = new input();
	a.nhap();
	a.xuat();
	
}
}
