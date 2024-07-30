package javaBasic;

public class ConstantExam {
	public static void main(String[] args) {
		final int j; //final 상수 선언 후에는 변경 불가
		j = 10;
		//j = 20; error
		System.out.println(j);
	}
}
