import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {

		int []array= {1,2,3,4,5};// forEach traditionnel 
		for (int i=0;i < array.length;i++) {
			int value =array[i];
			System.out.println(value);
			
		}
		System.out.println("________________________");//forEach depuis la version
		for (int i : array) {
			System.out.println(i);
			
			
		}
		System.out.println("______________________________________________________");
		
		ArrayList<String> languages=new ArrayList<>();
		languages.add("java");
		languages.add("C");
		languages.add("ja");
		languages.add("Keyton");
		System.out.println(languages);
		
		
		
	}

}
