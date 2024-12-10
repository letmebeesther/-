package t2021.final01.testa;
import java.util.Scanner;
public class FinalExamTest_A
{
	// �� �޼ҵ忡 ���� �迭 �� ������ ���������� ����
	static int score [][] = new int [60][8]; // 60�� 8���� 2���� �迭 ����
	static int cnt = 0; // �ο��� ī��Ʈ
	static int num, java, jsp, xml, photo; // �й�,�ڹ�,JSP,XML,���伥 ������ ����
	static String answer; // �ݺ� ó�� ���� ����
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		namePrint(); // ������ ���� ���
		dataInput(); // Ű����� ���� ������ �Է�
		printResult(); // Ű����� ���� �Է� ���� ������ ���
		bubbleSort(score); // �������� ���� (�������� �̿�)
		printResult(); // ������������ ���ĵ� ����� ���
		rankCal(); // ���� ���ϱ�(������ ����)
		printResult(); // ���� ��� ���
		} // end of main() method
	
	private static void namePrint() {
		System.out.println("=========================");
		System.out.println("���� : 2021�� 2�б� �⸻���");
		System.out.println("�а� : ����Ʈ IT �а�");
		System.out.println("�й� : 202149015");
		System.out.println("�̸� : ��������");
		System.out.println("=========================\n");
		} // end of namePrint() method
	
	private static void printResult() {
		System.out.println();
		System.out.println("============================================================");
		System.out.println("�й�\t�ڹ�\tJSP\tXML\t���伥\t����\t���\t����");
		System.out.println("============================================================");
		for (int i = 0; i < cnt; i++) {
			for(int j = 0;j<score[i].length;j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.println();
		} // end of for i
		
		System.out.println("============================================================");
	} // end of printResult() method
	
	// �й�,�ڹ�,JSP,XML,���伥 ������ Ű����� ���� �Է� ���� ����
	// ���� �� ����� ���Ͽ� 2���� �迭�� ����
	private static void dataInput() {
		int i = 0;
		System.out.println("***** �����Է� *****");
		do {
				System.out.println();
				System.out.print("�� �� : ");
				num = sc.nextInt();
				System.out.print("�ڹ� : ");
				java = sc.nextInt();
				System.out.print("JSP : ");
				jsp = sc.nextInt();
				System.out.print("XML : ");
				xml = sc.nextInt();
				System.out.print("���伥 : ");
				photo = sc.nextInt();
				// �� ���⸦ �ۼ�
				// �й�,�ڹ�,JSP,XML,���伥 ������ 2���� score �迭�� ����
				score [i][0] = num;
				score [i][1] = java;
				score [i][2] = jsp;
				score [i][3] = xml;
				score [i][4] = photo;
				
				// �� ���⸦ �ۼ�
				// 4 ������ ������ ����ϴ� �޼ҵ带 ȣ��
				int total = sum(i);
				
				// ����� ����ϴ� �޼ҵ带 ȣ��
				int aver = average(total);
				
				// ���� �� ����� score �迭�� ����
				score[i][5] = total;
				score[i][6] = aver;
				// �� ���⸦ �ۼ�
				
				System.out.print("����Ͻðڽ��ϱ�? (Y/y) : ");
				answer = sc.next();
				
				cnt++; // �ο��� ī��Ʈ
				i++; // 2���� �迭 ����
				answer.equalsIgnoreCase("y");// method : ���ڿ� �� (��ҹ��� ���о� ��)
				
		} while (answer.equalsIgnoreCase("y")); // end of do~while
				
		// Scanner ��ü close
		sc.close();
	} // end of dataInput() method
	
	private static int sum(int i) {
		int total = 0;
		total = java + jsp + xml + photo;
		return total;
		} // end of sum() method
	
	private static int average(int total) {
		return (total / 4);
		} // end of average() method
	
	private static void bubbleSort(int [][]score) {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0;j<cnt-1;j++) {
					// �� ���� ������ ���Ͽ� ���������� �̿��Ͽ� ������������ ��ȯ
					if (score[i][6] > score[j][6]) {
							for (int k = 0;k<7;k++) {
									// 2 ���� �迭�� i ��� i + 1���� ���� ��ġ�� ��ȯ
									swap(i, j, k);
							} // end of for k
					} // end if
			} // end of for j
		} // end of for i
	} // end of bubbleSort() method
	
	private static void swap(int i, int j, int k) {
		int temp = score[j][k];
		score[j][k] = score[i][k];
		score[i][k] = temp;
		} // end of swap() method
	
	private static void rankCal() {
		// �����ο�
		int t = 1;
		// ���� ������ ���ĵ� ������ �� ���� ������ �����Ƿ� 1 ���� �ο�
		score[0][7] = t;
		for(int i = 0;i < cnt-1;i++) {
			t++;
			if(score[i][6]==score[i+1][6])
				score[i+1][7] = score[i][7];
			else score[i+1][7]=t;
		}
		
		} // end of rank() method
} // end of class
		
		
	
	