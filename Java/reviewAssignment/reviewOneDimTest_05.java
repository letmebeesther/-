package reviewAssignment;

import java.util.Scanner;

public class reviewOneDimTest_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int [20];
		int total=0, count=0, i=0;
		float avg=0;
		char grade;
		
		
		printMyInfo();
		System.out.println();
		
		System.out.println("���� �Է�");
		
		/*for(int i = 0;i<x.length;i++) {
			
			System.out.printf("�迭 ["+i+"]��° = "); // �̷��Ե� i�� ����� �� ����
			x[i] = sc.nextInt();
			
			if(x[i]==-1) break;
			
			total += x[i];
			count++;
			
		} // end for i */
		
		while(true) {
			
			System.out.print("�迭 ["+i+"]��° = "); // �̷��Ե� i�� ����� �� ����
			int x = sc.nextInt();
			
			if(x<0) break;
			
			total += x;
			count++;
			score[i] = x;
			i++;
			
		} // end while
		
		avg = total/count;
		
		switch((int)avg/10) // avg�� float�̱� ������ 10�̶� ����Ϸ��� int�� ����ȯ ������� 
		{
		case 10 : 
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F'; break;
		};
		
		for(i = 0;i<count;i++) {
			System.out.printf("\nscore["+i+"] = %d", score[i]);
		}
	
		System.out.printf("\n\n���� : %d  ��� : %.2f  ���� : %c", total, avg, grade);
		
		sc.close();
	}
	


	private static void printMyInfo() {
		System.out.println("\n======================");
		System.out.println("���� : 10��������");
		System.out.println("�а� :  ����ƮIT�а�");
		System.out.println("�й� : 202149015");
		System.out.println("�̸� : ��������");
		System.out.println("======================\n");
	}

}
