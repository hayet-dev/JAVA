
public class regEx2 {

	public static void main(String[] args) {
		String data ="Appl 0123 Microsoft 1238787 IBM 6767786 ";
		String regExp ="^[a-zA-Z0-9]$";
		System.out.println(data.matches(regExp));//---> false afficher avec regExp 
		
		//String[]company =data.split("\\.");//déclaré un tableau 
		
		System.out.println(data.replaceAll("\\d"," "));//Afficher tous les caractéres sauf les nombres
		System.out.println(data.replaceAll("\\D"," "));//Afficher tous juste des nombres 
		System.out.println(data.replaceAll("[^2-9]+"," "));//Remplacer les chiffres par le vide 
		System.out.println(data.replaceAll("[^a-z]+"," "));//Afficher le majuscule et miniscule 
		
//		for(String str: company ) {    //parcourir un tableau caractére 
//		
//			System.out.println(str );
//	}
//	

}
}
