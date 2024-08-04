package javaBasic;
//클래스 형변환
public class CosmosExam {
	
	public static void main(String[] args) {
		Flower f = new Cosmos();
		f.wither();
//		f.blossom();
		
		Cosmos c = (Cosmos)f;
		c.wither();
		c.blossom();
		
	}
}
