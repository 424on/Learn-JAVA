package javaBasic;
//오버라이드
public class Tuna extends Fish {
	public void swim() {
		super.swim();
		System.out.println("Tuna의 swim 메소드");
	}
}
