package buoi2.lthdt.ctu.edu.vn;

public class SDDiem {
	public static void main(String args[]) {
		Diem a=new Diem();
		a.Diem(5, 6);
		a.in();
		Diem b=new Diem();
		b.nhap();
		b.in();
		System.out.println("khoan cach toi goc toa do la "+a.khoangCach());
		System.out.println("ab co khoan cach la "+a.khoangCach(b));
//		b.tinhTien(1, 2);
//		b.in();
//		Diem c=new Diem();
//		c.Diem(-b.layX(), -b.layY());
//		c.in();
	}
	
}
