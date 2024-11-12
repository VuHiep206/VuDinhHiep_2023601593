package Chapter2;
import java.util.Scanner;
public class HourToSecond {
	public static int secondCount(int a, int b, int c) {
		return 3600*a + 60*b + c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so gio: ");
		int gio = sc.nextInt();
		System.out.println("Nhap so phut: ");
		int phut = sc.nextInt();
		System.out.println("Nhap so giay: ");
		int giay = sc.nextInt();
		System.out.println("Ket qua la = "+secondCount(gio,phut,giay)+" giay");
		sc.close();
	}

}
