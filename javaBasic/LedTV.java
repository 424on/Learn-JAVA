package javaBasic;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("뵬륨을 조정하다");
	}

	@Override
	public void changChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("channel을 지정하다.");
	}

}
