import java.util.regex.Pattern;

public class regExpcompilation {
	
private static Pattern emailPatern =Pattern.compile("^[\\\\w.-]+@[\\\\w.-]+\\\\.[a-z]{2,}$"); 
	 	
public static boolean isValidMail(String email){
	
		
//String reExp = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";	
		return emailPatern.matcher(email).matches(); //instruction matcher()	
	}
 


	
	public static void main(String[] args) {
		System.out.println("----------------verifier le temps d'execution-----------");
		
		long begin =System.currentTimeMillis();
		long end  =System.currentTimeMillis();
		for(int i=0; i<1; i++) {
			isValidMail("gautierhayet@outlook.fr");
				
		}
		System.out.println("duration:" +(end-begin)+  " : ms");
		
		System.out.println(isValidMail("gautierhayet@outlook.f"));// au moins un caractére aprés le point
//		System.out.println(isValidMail("@@.@")); //resulat erronée 
        
	
	
	
	
	
	
	
	
	
	}
	}



