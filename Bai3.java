package lesson_1;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int age, year;
	String name;
	System.out.println("Nhap ho va ten: ");
	name = scanner.nextLine();
	System.out.println("Nhap nam sinh: ");
	year = scanner.nextInt();
	// xac dinh do tuoi
	age = 2023 - year;
	if(0 < age && age < 16) {
		System.out.println(" Ban " + name + " o do tuoi vi thanh nien. ");
	}
	else if(16 <= age && age < 18 ){
	    System.out.println(" Ban " + name + " o do tuoi truong thanh. ");
	}
	else {
		System.out.println(" Ban " + name + " o do tuoi gia. ");
	}
	}
}
