package javaBasic;

public class SwitchExam {
	
	public static void main(String[] args) {
		//switch, case, default, break
		int value = 2;
		
		switch(value){
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2"); // 2 3 그 외 다른 숫자 출력
			case 3:
				System.out.println("3");
			default :
				System.out.println("그 외 다른 숫자");
		}// case 성질은 맞는 case부터 나머지 부분을 실행함.
		
		//break
		int value1 = 2;
		
		switch(value1){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2"); // 2 출력
				break;
			case 3:
				System.out.println("3");
				break;
			default :
				System.out.println("그 외 다른 숫자");
		}
		
		String str = "A";
		switch(str) {
		case "A":
			System.out.println("A"); //A
			break;
		case "B":
			System.out.println("B");
		}

}
}
