package javaBasic;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = i/j;
		System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다."+e.toString());//catch 여러개 사용 가능
		}finally {
			System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
		}
		
		System.out.println("main end!!");
		
	}
		
}
