package Chapter2;

public class Area {
	public static float perimeterCircle(int r) {
		return (float) (2*Math.PI*r);
	}
	public static float acreageCricle(int r) {
		return (float) (2*Math.PI*r*r);
	}
	public static void main(String[] args) {
		int r = (int)(Math.random()*100);
		System.out.println("Gia tri cua r = "+r);
		System.out.println("Chu vi cua hinh tron la: "+perimeterCircle(r));
		System.out.println("Dien tich cua hinh tron la: "+acreageCricle(r));
	}

}
