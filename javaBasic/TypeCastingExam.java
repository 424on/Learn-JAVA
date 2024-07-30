package javaBasic;

public class TypeCastingExam {
	
	public static void main(String[] args) {
		int  x = 50000;
		long y = x;
		//크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때에는 묵시적으로 형을 바꾸어 준다.
		System.out.println(y); // 50000
		
		long y2 = 9;
		int x2 = (int) y2;
		//크기가 더 큰 타입을 작은 타입으로 바꿀 때에는 명시적으로 변환 해주어야 한다.
		System.out.println(x2); // 9
		
		//크기가 더 큰 타입을 작은 타입으로 바꿀 때에는 명시적으로 변환 해주어야 한다.
	}
}
