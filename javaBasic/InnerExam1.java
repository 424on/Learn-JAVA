package javaBasic;

public class InnerExam1 {
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1.Cal cal = new InnerExam1.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
