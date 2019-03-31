package buoi4.lthdt.ctu.edu.vn;
import java.util.Scanner;

import buoi3.lthdt.ctu.edu.vn.Diem;
public class DiemMau extends Diem {
	private String mau;
	public DiemMau() {
		super();
		String mau=new String();
		Scanner sc= new Scanner(System.in);
//		System.out.println("nhap mau");
//		mau=sc.nextLine();
	}
	public DiemMau(int x, int y,String mau) {
		super(x,y);
	}
	public DiemMau(DiemMau dm) {
		super(dm);
		mau=new String(dm.mau);
	}
	public void ganMau(String m) {
		mau=new String(m);
	}
	// day dc goi la nap de
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao mau");
		mau=sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("mau "+mau);
	}
	public DiemMau doiXung() {
		DiemMau kq=new DiemMau(-layX(),-layY(),mau);
		return kq;
	}
}
