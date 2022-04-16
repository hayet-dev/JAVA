import java.util.regex.Pattern;

public class regExpattern {
	
private static Pattern separatorPattern  =Pattern.compile("\\s+"); 
//private static Pettern emailPattern =Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$");


	
	public static void main(String[] args) {
		
		String str ="this is \t a string with mutliple \n separtors ";
		//String email="gautierhayet@outlook.fr";
		
		
		System.out.println(separatorPattern.matcher(str).replaceAll("  "));//---> avec la methode pattern compile
		
		//System.out.println(emailPattern.matcher(email).matches());
		
		
		
		
		

	
	
	
	
		
		
		
	
	
	
	
	
	}
	}



