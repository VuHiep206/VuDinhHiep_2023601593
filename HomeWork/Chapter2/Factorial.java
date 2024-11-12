package Chapter2;
import java.util.Scanner;

public class Factorial {
	public static int giaiThua(int n) {
		int result=1;
		if( n==0 || n==1)
			return 1;
		else return result = n*giaiThua(n-1);
		
	}

 public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Nhap so nguyen n= ");
	 int n = sc.nextInt();
	 System.out.println("Giai thua = " +giaiThua(n));
	 sc.close();
	 
	 
 }
}

