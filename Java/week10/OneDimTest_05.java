package week10;

import java.util.Scanner;

public class OneDimTest_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		printMyInfo();
		int score [] = new int[20];
		int i = 0, count = 0, sum = 0;
		double average;
		char grade;
		System.out.println("���� �Է� ");
		
		while(true) 
		{
			System.out.print("�迭 ["+ i +"]��° = ");
			int x = sc.nextInt();
			if(x<0)break;
			score[i]=x;
			i++;
			count++;
		}  
		
		sc.close();
		
		System.out.println("\n�Էµ� �� ���");
		
		for(i=0;i<count;i++) {
			System.out.printf("score [%d] = %d\n", i, score[i]);
		}

		i = 0;
		while(i<count) 
		{
			sum += score[i];
			i++;	
		}
		
		average = (double)sum/count;
		
		switch((int)average/10) 
		{
		case 10 :
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F'; break;
		}
		
		System.out.println();
		System.out.printf("���� = %d, ��� = %.2f, ���� = %c\n", sum, average,grade);
	}

	private static void printMyInfo() {
		System.out.println("======================");
		System.out.println("���� : 10����");
		System.out.println("�а� : ����ƮIT�а�");
		System.out.println("�й� : 202149015");
		System.out.println("�̸� : ��������");
		System.out.println("======================\n");
	}

}
