package Chapter2;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
        
        scanner.close();
    }

    public static boolean isPrime(int n) {
        // Kiểm tra các trường hợp đặc biệt
        if (n <= 1) return false; // Số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        if (n <= 3) return true;  // Số 2 và 3 là số nguyên tố

        // Loại bỏ các số chẵn và chia hết cho 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Kiểm tra các số từ 5 đến √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        
        return true;
    }
}
