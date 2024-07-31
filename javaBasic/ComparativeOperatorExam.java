package javaBasic;

public class ComparativeOperatorExam {
	
	public static void main(String[] args) {
		int i =10;
		int j = 10;
		
	    System.out.println(i == j ); //true
	    System.out.println(i != j ); //false
	    System.out.println(i < j); // false
	    System.out.println( i <= j); //true
	    System.out.println(i > j); // false
	    System.out.println(i >= j); // true
	    
	    i += 10; // i = i + 10;  과 같은 의미 

	    System.out.println(i);  
	    System.out.println(i -=5);
	    System.out.println(i);
	}
}
