package week3;

import java.util.Scanner;

public class IfElseTest_01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		if(n%2 != 0)
			System.out.printf("\n�Է��� ���� %d�� Ȧ��",n);
		else
			System.out.printf("\n�Է��� ���� %d�� ¦��",n);
		
		sc.close();
	}

}
