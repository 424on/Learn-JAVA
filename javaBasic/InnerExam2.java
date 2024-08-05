package javaBasic;

public class InnerExam2 {
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
		}
	public static void main(String[] args) {
		InnerExam2 t = new InnerExam2() {
			t.exec();
		}
		
	}
}
