package reviewWeek12_13;

public class reviewJaggedArrTest_02 {

	public static void main(String[] args) {
		int x[][] = 
			{
				{3,4,5,2}, // 0�� 4��
				{3,4,5}, // 1�� 3��
				{6,7,8,9,10,11}, // 2�� 6��
				{1,2,3,4,5} // 3�� 5��
			}; // ���� 4������ ����. ���� �ʱⰪ�� ���� ũ�Ⱑ ������
		System.out.printf("���� ũ�� = %d\n", x.length);
		System.out.println();
		
		for(int i=0;i<x.length;i++) {
			int sum = 0;
			for(int j=0;j<x[i].length;j++) {
				sum += x[i][j]; //  �� ���� �� ���ϱ�
				
				System.out.print(x[i][j]+"");
			} // end for j
			
			System.out.printf("\t���� ũ�� = %d[%d]���� (��) = %d", x[i].length,i,sum);
			System.out.println();;
		} //end for i
	} // end main()
} // end class
