package reviewWeek10_11;

public class reviewOneDimTest_01 {

	public static void main(String[] args) {
		int intArr [] = new int[5]; // ������ �迭 ���� ��
		
		// �ʱ�ȭ
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		
		for(int i = 0;i<5;i++) {
			System.out.printf("intArr[%d] = %d\n", i, intArr[i]);
		}
		
		int sum = 0;
		
		for(int i=0;i<5;i++) {
			sum += intArr[i];
		}
		
		System.out.printf("\n1���� �迭�� �� = %d", sum);

	}

}
