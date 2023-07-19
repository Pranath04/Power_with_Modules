package powerwiththemodules;

import java.util.Scanner;

public class Power{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int A = scanner.nextInt();
		System.out.println("Enter the value of B");
		int B = scanner.nextInt();
		System.out.println("Enter the value of C");
		int C = scanner.nextInt();
		scanner.close();
		System.out.print(powermodules(A,B,C));
	}
	public static int powermodules(int A,int B,int C) {
		A=A%C;
		int result=1;
		for(int i=1;i<=B;i++) {
			result = (result*A)%C;
		}
		return result;
	}
}