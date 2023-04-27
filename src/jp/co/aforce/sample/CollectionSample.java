package jp.co.aforce.sample;

public class CollectionSample {
	public static void main(String[] args) {
		//	ArrayList<String> fruits =new ArrayList<>();
		//	fruits.add("りんご");
		//	fruits.add("みかん");
		//	System.out.println(fruits);
		//	fruits.add(1,"ぶどう");
		//	System.out.println(fruits);
		//	fruits.remove("ぶどう");
		//	System.out.println(fruits);

		//	String fruit = fruits.get(1);
		//	System.out.println(fruits);
		//	fruits.set(1, "メロン");
		//	System.out.println(fruits);

		//	ArrayList<String> colors =new ArrayList<>();
		//	colors.add("赤");
		//	colors.add("青");
		//	colors.add("黄色");
		//	colors.add("オレンジ");
		//	colors.add("緑");
		//	colors.add("ピンク");
		//	colors.add("紫");
		//	
		//	System.out.println(colors.get(5));
		//	colors.remove(1);
		//	colors.add(2,"水色");
		//	System.out.println(colors.get(1));

		//	colors.set(6, "白");
		//	colors.add(0,"黒");
		//	System.out.println(colors.get(6));

		//HashSet<String> fruits = new HashSet<>();
		//System.out.println(fruits.add("りんご"));
		//System.out.println(fruits.add("みかん"));
		//System.out.println(fruits.add("ぶどう"));
		//System.out.println(fruits);
		//fruits.remove("ぶどう");
		//System.out.println(fruits);
		
		//HashMap<String, String> members = new HashMap<>();
		//System.out.println(members.put("naka@s.jp", "中垣謙史"));
		//System.out.println(members.put("haya@s.jp", "林"));
		//System.out.println(members);
		//System.out.println(members.put("naka@s.jp", "中原"));
		//System.out.println(members);
		//members.remove("haya@s.jp");
		//System.out.println(members);
		//System.out.println(members.get("naka@s.jp"));
		//String member = members.get("haya@s.jp");
		//System.out.println(member);
			
		//HashMap<String, String> employees = new HashMap<>();
		//employees.put("A001","田中太郎");
		//employees.put("A002","佐藤次郎");
		//employees.put("A003","山田花子");
		//employees.put("A004","佐藤次郎");
		//System.out.println(employees);
		
		//employees.remove("A003");
		//employees.put("A004"," 高橋三郎");
		//System.out.println(employees);
		
		String[] singo = {"赤","黄","青"};
		System.out.println(singo[0]);
		singo[2] ="緑";
		System.out.println(singo[2]);
		
		int[] numbers = {1,2,3,4,5};
		System.out.println(numbers[4]);
		
	}
}
