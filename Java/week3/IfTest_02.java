package week3;

import java.util.Scanner;

public class IfTest_02 {

	public static void main(String[] args) 
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("���� : ");
		int score = sc.nextInt();
		
		if(score >= 90)
		{
			System.out.println("\n����� ���� good!");
			System.out.println("���� ���ɼ� OK!");
		}
		
		System.out.printf("\n����� ������ %d ��\n", score);
		
		sc.close();
		

	}

}
