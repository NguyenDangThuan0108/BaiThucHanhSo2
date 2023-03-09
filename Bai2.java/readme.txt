package lesson_1;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nhap so: ");
	int a = scanner.nextInt();
	if(a  % 2 == 0) {
		System.out.println("So vua nhap la so chan! ");
	}else {
			System.out.println("So vua nhap la so le! ");
		}
	}
}
