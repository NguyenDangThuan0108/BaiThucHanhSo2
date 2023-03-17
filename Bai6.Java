package lesson_1;
import java.util.Scanner;
public class Bai6 {
	public static void main(String[] args) {
		int number;
		int giaithua = 1;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so: ");
        number = scanner.nextInt();
	    for(int i = 1 ; i <= number ; i++)
        giaithua *= i;
     System.out.println("Giai thua = " + giaithua);
	}
}
