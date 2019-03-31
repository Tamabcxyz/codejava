package thuchanhonline.lthdt.ctu.edu.vn;

import java.util.Scanner;

public class DuongChayDaiNhat {
	// CAI NAY KHONG HIEU??
	public static void xuat(int a[], int b[]) {
		int max=0;
		for(int i:b) {
			if(i>max)max=i;
		}

		for(int i:a) {
			System.out.print(i+"\t");
		}
		int index=0;
		for(int i:b) {
			if(i==max) {
				System.out.println("\nvi tri "+index+" co do day la: "+max);
				
			}
			index+=i+1;
		}

/*		int max=0;
		for(int x:b)if(x>max)max=x;
		System.out.println("mang a la: ");
		for(int x:a)System.out.print(x+" ");
		int vt=0;
		for(int x:b) {
			if(x==max)System.out.println(" \nvi tri "+vt+" do day "+max);
			vt+=x+1;
		}
*/
	}
	public static void duongChay(int a[]) {
		int b[]=new int[a.length];
		int vitri=0;
		for(int i=0;i<a.length-1;i++)
			if(a[i+1]<a[i]) {
				vitri++;
				b[vitri]++;
				
			}
			else b[vitri]++;
		xuat(a,b);
	}
	public static void main(String[] args) {
		int a[];
		int b[];
		System.out.println("nhap vao so luong phan tu cua mang");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			System.out.println("phan tu thu "+(i+1));
			a[i]=sc.nextInt();
		}
		duongChay(a);
		
		
	}

}
