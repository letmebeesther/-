package week4;

import java.util.Scanner;

public class ForTest_06 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String grade;
		String SchoolName = "����ƮIT �а� ";
		String SchoolNumber = "202149015";
		String Name = "��������";
		
		System.out.println("*********************");
		System.out.printf("�а� : %s\n", SchoolName);
		System.out.printf("�й� : %s\n", SchoolNumber);
		System.out.printf("�̸� : %s\n", Name);
		System.out.println("*********************");
		
		for(;;) 
		{
			System.out.print("\n���� �Է� : ");
			int score = sc.nextInt();
			if(score<0) 
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			switch(score/5) 
			{
			
			case 20 : 
			case 19 : grade = "A+"; break;
			case 18 : grade = "A0"; break;
			case 17 : grade = "B+"; break;
			case 16 : grade = "B0"; break;
			case 15 : grade = "C+"; break;
			case 14 : grade = "C0"; break;
			case 13 : grade = "D+"; break;
			case 12 : grade = "D0"; break;
			default : grade = "F"; break;
	
			}
			
			System.out.printf("������ \"%s\"�̴�.\n", grade);
		}
		
		sc.close();

	}

}
