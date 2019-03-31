package buoi2.lthdt.ctu.edu.vn;

public class SDPhanSo {
	public static void main(String args[]) {
		PhanSo a=new PhanSo();
		a.nhap();
		if(a.layTu()==a.kiemTra()) {
			a.in();
		}else System.out.println("kq phan so vua nhap la "+a.kiemTra());
	}
}
