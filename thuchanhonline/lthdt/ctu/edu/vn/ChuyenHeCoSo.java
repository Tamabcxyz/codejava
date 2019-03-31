package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class ChuyenHeCoSo {
	
	public static String chuyen(int n, int k) {
		String temp="";
		int x;
		while(n>0){
			x=n%k;
			n=n/k;
			if(k==16) {
				if(x==10) {
					temp+='A';
				}
				if(x==11) {
					temp+='B';
				}
				if(x==12) {
					temp+='C';
				}
				if(x==13) {
					temp+='D';
				}
				if(x==14) {
					temp+='E';
				}
				if(x==15) {
					temp+='F';
				}
				if(0<=x&&x<10) temp+=x;
			}
			else temp+=x;
		}
		return temp;
	}
	public static void xuat(String a) {
		System.out.println("kq la: ");
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
	public static void main(String[] args) {
		System.out.println("nhap vao so can chuyen");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("chuyen toi he nao?");
		int k=sc.nextInt();
		String str=chuyen(n,k);
		xuat(str);

	}

}
