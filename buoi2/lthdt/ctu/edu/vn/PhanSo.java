package buoi2.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class PhanSo {
	private int tuso,mauso;
	public void PhanSo() {
		tuso=0;mauso=0;
	}
	public void PhanSo(int tu,int mau) {
		tuso=tu;
		mauso=mau;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao tu so ");
		tuso=sc.nextInt();
		tuso=kiemTra();
		do {
			System.out.println("nhap vao mau so ");
			mauso=sc.nextInt();
		}while(mauso==0);
	}
	public void in() {
		System.out.println("phan so vua nhap la "+tuso+"/"+mauso);
	}
	public int layTu() {
		return tuso;
	}
	public int layMau() {
		return mauso;
	}
	public int kiemTra() {
		int ketqua=this.tuso;
		if(tuso==0) {
			return ketqua=0;
		}
		else if(mauso==1) {
			return ketqua=tuso;
		}
		return ketqua;
	}
}
