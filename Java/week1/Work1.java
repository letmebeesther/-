package week1_20210909;
import java.util.Scanner;
public class Work1 {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				
				System.out.print("���� x : ");
				int x = sc.nextInt();
				
				System.out.print("���� y : ");
				int y = sc.nextInt();
				
				System.out.print("���� z : ");
				int z = sc.nextInt();
				
				System.out.println();
				
				int max = (x > y) ? x : y;
				max = (max > z) ? max : z;
				System.out.printf("x = %d, y = %d, z = %d �� �ִ� �� = %d n",x,y,z,max);
				
				int min = (x < y) ? x : y;
				min = (min < z) ? min : z;
				System.out.printf("x = %d, y = %d, z = %d �� �ּ� �� = %d n",x,y,z,min);
				
				if (x > y)
						max = x;
				else
						max = y;
				if (max < z)
						max = z;
				
				System.out.println();
				
				System.out.println("if ~ esle ���� �̿��Ͽ� 3 ���� ���� �� �ִ� �� ���ϱ�");
				
				System.out.println();
				
				System.out.printf("x = %d, y = %d, z = %d �� �ִ� �� = %d n",x,y,z,max);
				
				sc.close();
	}

}
