package jp.co.aforce.sample;

public class Relational2 {
	public static void main(String[] args) {
		
		System.out.println("(10 > 0) && (20 == 20) は" + ((10 > 0) && (20 == 20)));
		System.out.println("(10 < 0) && (20 == 20) は" +((10 < 0) && (20 == 20)));
		System.out.println("(10 > 0) && (20 == 21) は" + ((10 > 0) && (20 == 21)));
		System.out.println("(10 < 0) || (20 == 20) は" + ((10 < 0) || (20 == 20)));
		System.out.println("(10 < 0) || (20 == 21) は" + ((10 < 0) || (20 == 21)));
	    System.out.println("!(10 < 0) は" + (!(10 < 0)));
		System.out.println("!(20 == 20) は" + (!(20 == 20)));
	}
}
