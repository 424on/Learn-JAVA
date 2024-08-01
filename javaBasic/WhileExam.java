package javaBasic;

public class WhileExam {
	
	public static void main(String[] args) {
//		int i =0;
//		
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		} 012345678910
		
		int total = 0;
		int i = 1;
		while(i<=100) {
			total = total + i;
			i++;
		}
		System.out.println(total); //5050
	}
}
