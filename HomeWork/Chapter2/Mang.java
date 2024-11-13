package Chapter2;

import java.util.Scanner;

public class Mang {
	public static int[] creatMang(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}

	public static int[] printMang(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;
	}

	public static int[] arange(int[] arr) {
		int tg;
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i]) > (arr[j])) {
					tg = arr[i];
					arr[i] = arr[j];
					arr[j] = tg;
				}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri n: ");
		int n = scanner.nextInt();
		int[] arr = Mang.creatMang(n);
		Mang.printMang(arr);
		System.out.println("Mang sau khi sap xep la: ");
		arr = Mang.arange(arr);
	}
}
