package buoi3.lthdt.ctu.edu.vn;
import java.util.Scanner;
public class Diem {
	private int x,y;
	public Diem() {
		x=0;y=0;
	}
	public Diem(int x, int y) {
		this.x=x; this.y=y;
	}
	public void nhap() {
		System.out.println("nhap vao toa do x va y");
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();y=sc.nextInt();
	}
	public void in() {
		System.out.println("("+x+","+y+")");
	}
	public Diem(Diem obj) {
		x=obj.x;
		y=obj.y;
	}
	public void gan(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int layX() {
		return x;
	}
	public int layY() {
		return y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public void tinhTuyen(int dx, int dy) {
		// TODO Auto-generated method stub
		x=x+dx;y=y+dy;
	}
	public float khoangCach(Diem d1) {
		// TODO Auto-generated method stub
		return (float)Math.sqrt((x-d1.x)*(x-d1.x)+(y-d1.y)*(y-d1.y));
	}
	
	
}
