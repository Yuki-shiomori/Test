package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
//問題1.2
		ArrayList<String> stationary =new ArrayList<>();
			stationary.add("シャープペンシル");
			stationary.add("ボールペン");
			stationary.add("リングノート");
			stationary.add("クリップ");
			stationary.add("消しゴム");
			System.out.println(stationary.get(1));

		
//問題3.5		
		ArrayList<String> name =new ArrayList<>();
		name.add("山田太郎");
		name.add("鈴木花子");
		name.add("佐藤二朗");
		name.add("山田太郎");
		name.add("高橋三郎");
		
		System.out.println(name.get(2));
	}
}
