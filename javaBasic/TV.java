package javaBasic;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100; //final 없이도 상수 사용 가능
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changChannel(int channel);
	
}
