package week6;

import java.util.Scanner;

public class ExerciseTest5_03 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.print("���� n�Է�");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1 ; i<=n ; i++) 
		{
			int sum=1;
			
			for(int j=1;j<=i;j++) 
			{
				sum *= j;
				
			}
			System.out.printf("[%d]�� ������ ������ �� = %d\n",i, sum);
			total += sum;
		}
		
		System.out.printf("\n[%d]�� ������ ���� = %d\n",n,total);

		sc.close();
		
	}

}
