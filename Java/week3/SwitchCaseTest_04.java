package week3;

import java.util.Scanner;

public class SwitchCaseTest_04 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� x : ");
		int x = sc.nextInt();
		System.out.print("������ �Է� + , - , * , / , % : ");
		String op = sc.next();
		System.out.print("���� y : ");
		int y = sc.nextInt();
		System.out.println();
	
		switch (op)
		{
		case "+":
		System.out.printf("%d + %d = %d\n", x, y, (x + y));
		break;
		case "-":
		System.out.printf("%d - %d = %d\n", x, y, (x - y));
		break;
		case "*":
		System.out.printf("%d * %d = %d\n", x, y, (x * y));
		break;
		case "/":
		System.out.printf("%d / %d = %d\n", x, y, (x / y));
		break;
		case "%":
		System.out.printf("%d %% %d = %d\n", x, y, (x % y));
		break;
		} 
		
		sc.close();

	}

}
