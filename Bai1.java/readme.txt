package lesson_1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Nhap so thu nhat la: ");
		int a = scanner.nextInt();
		System.out.println("Nhap so thu hai la: ");
		int b = scanner.nextInt();
		
		// tong, hieu, tich, thuong ,chia lay du hai chu so la
		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		 
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		
		int tich = a * b;
		System.out.println(a + " * " + b + " = " + tich);
		
		float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + thuong); 
        
        int chialaydu = a % b;
        System.out.println(a + " % " + b + " = " + chialaydu);
        
        // so sanh hai so bang toan tu
        if(a == b) {
        	System.out.println(a + " = " + b);
        }
        else {
        	if(a > b || b < a) {
        		System.out.println(a + " > " + b);
        	}
        	else {
        		System.out.println(a + " < " + b);
        	}
        }
	}

}
