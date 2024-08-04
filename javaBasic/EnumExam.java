package javaBasic;

public class EnumExam {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy"; 에러
		System.out.println(gender1); //boy
		System.out.println(gender2); //FEMALE
	}
}
//열거형은 아래 선언
// enum 이름{ 값1, 값2; }
enum Gender{
	MALE,FEMALE;
}
