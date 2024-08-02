package javaBasic;

public class StringExam {
	
	public static void main(String[] args) {
		//String 클래스는 자바에서 가장 많이 사용하는 클래스
		String str1 = "hello";
		String str2 = "hello";
		/* 
		 * 위 와 같이 선언된 값은 상수로써 메모리에 저장된다.
		 * str1에서 생성된 "hello"상수가 생기게 되고.
		 * str2가 생성 될때 "hello"상수가 존재하므로 
		 * 둘다 같은 메모리주소에 저장된 상수 값을 지정하게된다.
		 */
		String str3 = new String("hello");
		String str4 = new String("hello");
		/*
		 * 위와 다르게 각각 생성된 값을 갖게 된다.
		 */
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		}
		if(str1 == str3) {
			System.out.println("str1과 str3는 같은 레퍼런스입니다.");
		}
		if(str3 == str4) {
			System.out.println("str1과 str3는 같은 레퍼런스입니다.");
		}
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1);
		
		//같을 비교하기 위해서는 String 클래스의 equals 메소드를 이용한다.
		if( str3.equals(str4) ){
            System.out.println("str3과 str4는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str3과 str4는 다른 값을 가지고 있습니다.");
        }
	}
}
