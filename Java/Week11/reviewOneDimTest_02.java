package reviewWeek10_11;

public class reviewOneDimTest_02 {

	public static void main(String[] args) {
		int intArr[] = new int[] {10,20,30,40,50}; // �迭�� ����� ���ÿ� �ʱ�ȭ1
		
		System.out.printf("�迭�� ũ�� = %d\n", intArr.length);
		System.out.println();

		for(int i = 0;i<intArr.length;i++)
			System.out.printf("intArr[%d] = %d\n", i,intArr[i]);
		
		int sum = 0;
		
		for(int i = 0;i<intArr.length;i++)
			sum += intArr[i];
		
		System.out.printf("\n1���� �迭�� �� =%d", sum);
	}

}
