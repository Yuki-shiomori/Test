package jp.co.aforce.practice;
import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest４ {
	public static void main(String[] args) {
//問題2.3
	
		ArrayList<String> animal =new ArrayList<>();
		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("へび");
		
		
		String animals = animal.get(2);
		if(animal.contains(animals)) {	
			System.out.println(animals +"はリストの中に含まれています");
	} else {
		System.out.println(animals +"はリストの中に含まれていません");
	}	
			
		
		
		
		
//問題４
		Calendar ccalendar = Calendar.getInstance();
		String mounth = "4月";
	     
        switch (mounth) {
        case "1月":
            System.out.println("冬物セール");
            break;
        case "2月":
        case "3月":
        case "4月":
            System.out.println("春物を売る");
            break;
        case "5月":
            System.out.println("春物セール");
            break;
        case "6月":
        case "7月":  
        	System.out.println("夏物を売る");
            break;
        case "8月":
            System.out.println("夏物セール");
            break;
        case "9月":
            System.out.println("秋物を売る");
            break;
        case "10月":            
        case "11月":
        case "12月":
            System.out.println("冬物を売る");
            break;
        default:
            System.out.println("不正な月です");
        }
}

	
	}
