package reviewWeek10_11;

import java.util.Scanner;

public class reviewOneDimTest_05 {

	public static void main(String[] args) {
		
		/* ���� : 20�� �̳��� �ڷḦ �Է¹޾Ƽ� 1���� �迭�� ������ ����
		 * 1) ���� �� ��� ���ϱ�
		 * 2) ����� �̿��Ͽ� ���� ���ϱ�
		 * 3) �������� : �Է� ������ -1�̸� �����Ѵ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int [20];
		int i = 0, count = 0, sum = 0;
		double average;
		char grade;
		
		System.out.println("���� �Է�");
		
		do {
			System.out.print("�迭 ["+i+"]��° = ");
			int x = sc.nextInt(); //x�� �� �Է�
			
			if(x<0)break; // �Է��� ���� -1�̸� ����
			
			score[i] = x; //x���� �迭�� �Է�
			i++; // �ε��� ��ȣ ����
			count++; // �Է��� Ƚ���� ���� ����� ī��Ʈ
			
		} while(true);
		
		sc.close();
		
		System.out.println("\n�Էµ� �� ���");
		
		for(i = 0;i<count;i++)
			System.out.printf("score[%d] = %d\n", i, score[i]);
		
		i=0;
		
		while(i<count) {
			sum += score[i]; // �Է��� ���� ����
			i++;
		}
		
		average = (double)sum/count; // ��� = ����/�����
		
		switch((int)average/10) // ���/10. 10������ �����й� 
		{
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade = 'F'; break;
		}
		
		System.out.println();
		System.out.printf("���� = %d  ��� = %.2f  ���� = %c\n", sum, average, grade);
	
	}

}
