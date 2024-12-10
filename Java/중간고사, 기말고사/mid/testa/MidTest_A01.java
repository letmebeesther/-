package t2021.mid.testa;

import java.util.Scanner;

public class MidTest_A01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int info=0;
		
		System.out.print("���� n �Է� : ");
		int n = sc.nextInt();
		
		System.out.println();
		
		printfMyInfo(info);
		
		int total = totalSum(n);
		
		printfResult(n,total);
		
		sc.close();
	}

	private static void printfResult(int n, int total) 
	{
		System.out.printf("\n[%d] �� ������ ���� = %d",n,total);
		
	}

	private static int totalSum(int n) 
	{
		int total = 0;
		
		for(int i=1;i<=n;i++) 
		{
			total += i;
			System.out.printf("[%d] �ױ����� ������ �κ� �� = %d\n",i,total);
		}
	
		return total;
	}

	private static void printfMyInfo(int info) 
	{
		System.out.println("==================");
		System.out.println("���� : 1��");
		System.out.println("����Ʈ IT�а�");
		System.out.println("�й� : 202149015");
		System.out.println("�̸� : ��������");
		System.out.println("==================");
	}

}
