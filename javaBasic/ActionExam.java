package javaBasic;

public class ActionExam {

	public static void main(String[] args) {
//		Action action = MyAction();
//		action.exec();
		Action action = new Action() {
			
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
	}
}
