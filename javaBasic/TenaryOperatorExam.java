package javaBasic;

public class TenaryOperatorExam {
	
	public static void main(String[] args) {
		int b1 = (5 > 4) ? 50 : 40;
		System.out.println(b1); //50
		b1 = (5 < 4) ? 50 : 40;
		System.out.println(b1); //40
		
		int b2 = 0;
		if(5 < 4) {
			b2 = 50;
		}else {
			b2 = 40;
		}
		
		System.out.println(b2);
	}
}
