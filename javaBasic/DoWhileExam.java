package javaBasic;

import java.util.Scanner;

public class DoWhileExam {
	
	public static void main(String[] args) {
		
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		do {
			value = scan.nextInt();
			System.out.println("입력받은 값:"+value);
		}while( value !=10);
		
		System.out.println("반복문 종료!!"); 
//		12 입력받은 값:12
//		11 입력받은 값:11
//		10 입력받은 값:10
//		반복문 종료!!

	}
}
