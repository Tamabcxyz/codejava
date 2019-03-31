package buoi3.lthdt.ctu.edu.vn;
import buoi2.lthdt.ctu.edu.vn.*;
public class DoanThang {
	private Diem d1,d2; // d1,d2 la 2 doi tuong
	public DoanThang() {
		d1=new Diem();
		d2=new Diem(); //d1,d2 la doi tuong ko the nao gan truc tiep cho no =0 dc
	}
	public DoanThang(Diem a, Diem b) {// o day thu ko co void xem hoi su dung co bao loi hay ko
		d1=new Diem(a);
		d2=new Diem(b); // no dang su dung phuong thuc cua class Diem tamprofesstional
	}
	public DoanThang(DoanThang d) {// d la 2 doi tuong
		d1=new Diem(d.d1);
		d2=new Diem(d.d2);
	}
	public void makecopy(DoanThang d) {
		d1=new Diem(d.d1);
		d2=new Diem(d.d2);
	}
	public void nhap() {
		d1.nhap();//
		d2.nhap();
	}
	public void in() {
		System.out.print("[");d1.in();d2.in();System.out.print("]");
	}
	public String ToString() {
		return "["+d1+","+d2+"]";
	}
	public void tinhTuyen(int dx, int dy) {
		d1.tinhTuyen(dx, dy);// tai sao class nay ko su dung dc tinhTuyen cua Diem buoi2??
	}
	public float KhoangCach(Diem B) {
		return d1.khoangCach(d2);
	}
	public String toString() {
		return "["+d1+","+d2+"]";
	}
}
