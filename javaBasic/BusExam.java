package javaBasic;

public class BusExam {
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); // 상속
		bus.ppangppang();
		
		Car4 car = new Car4();
		car.run();
		
		//car.ppangppang(); 부모 클래스는 자식 클래스의 메소드를 사용하지 못함.
	}
}
