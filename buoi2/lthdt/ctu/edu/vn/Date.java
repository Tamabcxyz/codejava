package buoi2.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Date {
	private int ngay, thang, nam;
	// ham xay dung khong doi so
	public Date() {
		ngay=1;thang=1;nam=2011;
	}
	// ham xay dung co doi so
	public void Date(int day, int month, int year) {
		ngay=day;
		thang=month;
		nam=year;
	}
	// xay dung ham sao chep doi tuong Date
	public Date(Date d) {
		ngay=d.ngay;
		thang=d.thang;
		nam=d.nam;
	}
	public boolean hopLe() {
		boolean ok=false;
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};// gan so ngay cua cac thang vao mang tuong ung
		if(nam%4==0&&nam%100!=0||nam%400==0) {// kiem tra nam nhuan neu la nam nhuan thi thang 2 co 29 ngay
			max[2]=29;ok=false;
		}
		if(thang>0&&nam>0&&ngay>0&&thang<13&&ngay<=max[thang]) {// cai mang ten la max chua so ngay tu thang 0->thang 12
			ok=true;
		}
		return ok;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("nhap vao ngay:");
			ngay=sc.nextInt();
			System.out.println("nhap vao thang:");
			thang=sc.nextInt();
			System.out.println("nhap vao nam:");
			nam=sc.nextInt();
		}while(!hopLe());
	}
	public void in() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayHomSau() {
		Date d=new Date();
		d.ngay=this.ngay;d.thang=this.thang;d.nam=this.nam;
		d.ngay++;
		if(!d.hopLe()) {
			d.ngay=1;
			d.thang++;
			if(!d.hopLe()) {
				d.thang=1;
				d.nam++;
			}
		}
		return d;
	}
	public Date cong(int n) {
		Date d=new Date();
		d.ngay=this.ngay;d.thang=this.thang;d.nam=this.nam;
		for(int i=0;i<n;i++) {
			d=d.ngayHomSau();	
		}
		return d;
	}
	// ham ghi de phuong thuc co the xuat thang ra doi tuong trong ham in Vd: sop(s1)<=>s1.toString() (khi ko co ham nay)
	public String toString() {
		return ngay+"/"+thang+"/"+nam;
	}
}
