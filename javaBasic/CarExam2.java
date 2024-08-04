package javaBasic;

public class CarExam2 {
	
	public static void main(String[] args) {
		//Car2 c1 = new Car2();
		Car2 c2 = new Car2("소방차");
		Car2 c3 = new Car2("구급차");
		
		System.out.println(c3.name);
	}
	/* 특징
	 * 생성자는 리턴 타입이 없다.
	 * 생성자를 프로그래머가 만들지 않으면 매개변수가 없는 생성자가 컾파일할 때 자동으로 만들어진다.
	 * 매개변수가 없는 생성자를 기본생성자라고 한다.
	 * 생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다.
	 */
	
	/* 역할
	 * 생성자가 하는 일은 객체가 될 때 필드를 초기화 하는 역할을 수행한다.
	 * 자동차가 객체가 될때 반드시 이름을 가지도록 하려면, Car클래스를 다음과 같이 만들어야한다.
	 *  public class Car{
        String name;
        int number;

        public Car(String n){
            name = n;
        }
    }
	 */
}
