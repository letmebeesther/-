package reviewWeek10_11;

public class reviewOneDimTest_03 {

	public static void main(String[] args) {
		double dbArr[] = {10.01,20.02,30.03,40.04,50.05}; // �迭 ����� ���ÿ� �ʱ�ȭ2
		
		System.out.printf("�迭�� ũ�� = %d\n", dbArr.length);
		System.out.println();
		
		for(int i = 0;i<dbArr.length;i++)
			System.out.printf("dbArr[%d] = %.2f\n", i, dbArr[i]);
		
		double sum = 0;
		
		for(int i = 0; i<dbArr.length;i++)
			sum +=dbArr[i];

		System.out.printf("\n1���� �迭�� �� =%.2f", sum);
	}

}
