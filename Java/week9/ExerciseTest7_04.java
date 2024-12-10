package week9;

import java.util.Scanner;

public class ExerciseTest7_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int r = sc.nextInt();
		System.out.print("���� �Է� : ");
		int h = sc.nextInt();
		
		printMyInfo();
		
		double sphereVolume = volCalculate(r);
		double circularCornVolume = volCalculate(r,h);
		System.out.printf("���� ü�� = %3.2f\n", sphereVolume);
		System.out.printf("������ ü�� = %3.2f", circularCornVolume);
		
		sc.close();
	}

	private static double volCalculate(int r, int h) {
		double volume = (1.0/3.0)*Math.PI*Math.pow(r, 2)*h;
		return volume;
	}

	private static void printMyInfo() {
		System.out.println("\n=================");
		System.out.println("���� : �� 09��������");
		System.out.println("�а� : ����ƮIT�а�");
		System.out.println("�й� : 202149015");
		System.out.println("�̸� : ��������");
		System.out.println("=================\n");
	}

	private static double volCalculate(int r) {
		double volume = (4.0/3.0)*Math.PI*Math.pow(r, 3);
		return volume;
	}

}
