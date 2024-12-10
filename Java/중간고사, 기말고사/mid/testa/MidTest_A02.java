package t2021.mid.testa;

import java.util.Scanner;

public class MidTest_A02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� x : ");
		int x = sc.nextInt();
		
		System.out.print("���� y : ");
		int y = sc.nextInt();
		
		System.out.print("���� z : ");
		int z = sc.nextInt();
		
		printMyInfo();
		
		int total = totalXYZ(x,y,z);
		
		double average = averageXYZ(total);
		
		printResult(x,y,z,total,average);
		
		sc.close();
	}

	private static void printMyInfo() 
	{
		System.out.printf("================");
		System.out.printf("\n���� : 2��");
		System.out.printf("\n�а� : ����Ʈ IT�а�");
		System.out.printf("\n�й� : 202149015");
		System.out.printf("\n�̸� : ��������");
		System.out.printf("\n================");
		
	}

	private static void printResult(int x, int y, int z, double total, double average ) 
	{
		System.out.printf("\nx = %d",x);
		System.out.printf("\ny = %d",y);
		System.out.printf("\nz = %d",z);
		System.out.printf("\n================");
		System.out.printf("\n���� = %.0f",total);
		System.out.printf("\n��� = %.2f",average);
		
	}

	private static double averageXYZ(double total) 
	{
		double average = total/3.0;
		
		return average;
	}

	private static int totalXYZ(int x, int y, int z) 
	{
		int total = x+y+z;
	
		return total;
	}

}
