package reviewWeek12_13;

public class reviewTwoDimTest_02 {
// �»ﰢ ���
	public static void main(String[] args) {
		int x[][] = new int[5][5];
		int k = 1;
		
		for(int i = 0;i<x.length;i++) {
			for(int j = 0;j<=i;j++) // ���� ÷�ڰ� ���� ÷�ں��� �۰ų� ���� ��쿡�� �ʱ�ȭ�Ѵ�
			{
				x[i][j] = k;
				k++;
			} /// end for j
		} // end for i
		
		System.out.println("@@@�»ﰢ ����� �� ���@@\n");
		
		for(int i = 0;i<x.length;i++) //x.length : ���� ũ�� 5�� ��ȯ
		{
			for(int j = 0;j<x[i].length;j++) //x[i].length : i�࿡ ���� ���� ũ�� 5�� ��ȯ
			{
				System.out.printf("%6d", x[i][j]);
			} // end for j
			System.out.println();
		} // end for i
		
		
			

	}

}
