package javaBasic;

public class LedExam {
	
	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changChannel(8);
		tv.changeVolume(39);
		tv.turnOff();
		
	}
}
