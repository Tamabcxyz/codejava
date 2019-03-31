package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Bai4 {
	public static int ktrNhap() {
		String s;boolean t=true;
		int a=0;
		Scanner sc=new Scanner(System.in);
		do {
			s=sc.nextLine();
			try {
				a=Integer.parseInt(s);
				t=true;
			}catch(Exception e) {
				t=false;
				System.out.println("nhap lai: ");
			}
			
		}while(t==false);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap a: ");
		a=ktrNhap();
		System.out.println("nhap b: ");
		b=ktrNhap();
		System.out.println("tong 2 so a b la: "+(a+b));
	}

}