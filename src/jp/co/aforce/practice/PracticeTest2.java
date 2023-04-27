package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
//問題１
		double TAX = 0.1;
		System.out.println(TAX);
		
//問題２
		int x = 480;
		int price =(int)( x * 1.1);
		
		System.out.println(price);
		
//問題３
		 String name ="塩森";
		   String name2 ="友貴";
		   String name3 = name + name2;
		   System.out.println(name3);
		
		
//問題４		
		String saying ="この値段は";
		String saying2 = "円です";
		
		System.out.println( saying + price +  saying2 );
		
		
		
	}
}
