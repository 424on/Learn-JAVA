package javaBasic;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i,int j);
	
	default int exec(int i, int j) {
		return i + j;
	}
	
	public static int exe2(int i, int j) {
		return i * j;
	}
}
