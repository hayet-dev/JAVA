
public class RegExpDate {
public static boolean isValideDate(String date) {
	//String regExp ="^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$";
	//String regExp ="^[0-9]{2}/[0-9]{2}/[0-9]{2}([0-9]{2})?$";
	String regExp ="^(0[1-9]|[12][0-9]|3[012])/(0[1-9]|1[012])/(19|20)([0-9]{2}) ?$";
	
	
	return date.matches(regExp);
}
	public static void main(String[] args) {
		System.out.println(isValideDate("12/10/2020"));
		System.out.println(isValideDate("12/10/20"));
		System.out.println(isValideDate("12/10/2"));
		System.out.println(isValideDate("JJ/MM/AA"));
		System.out.println("*************************************************");//avec [0-9]{2}
		System.out.println(isValideDate("35/10/2020"));//==>false
		System.out.println(isValideDate("32/17/20"));//==>false
		System.out.println(isValideDate("12/10/2020"));//==>true
		

	}

}
