package week3;

import java.util.Scanner;

public class IfElseTest_03 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("����(M/m) / ����(F/f) : ");
		String sex = sc.next();
		
		if(sex.equalsIgnoreCase("M"))
		{
			System.out.println("\n����� �����Դϴ�.");
			System.out.printf("�Էµ� �� : %s\n",sex);
		}
		else
		{
			System.out.println("\n����� �����Դϴ�.");
			System.out.printf("�Էµ� �� : %s\n",sex);
		}
		
		sc.close();
	}

}
