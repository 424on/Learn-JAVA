package javaBasic;

public class MyClassExam {
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.method1();
		myclass.method2(10);
		int value = myclass.method3();
		System.out.println("m3이 리턴한값 "+ value);
		myclass.method4(5, 10);
		int value2 = myclass.method5(55);
		System.out.println("m5 가 리턴한 값:"+ value2);
		/*
		 * 기본형 타입은 다른 메소드에 매개변수로 전달될 때 값이 그래도 전달되므로 변수에는 아무런 영향을 미치지 않는다.
		 * 하지만 
		 * 참조형 타입은 다른 메소드에 매개변수로 전달될때, 변수의 주소가 전달되기 때문에 변수값에 영향을 준다.
		 */
	}

}
