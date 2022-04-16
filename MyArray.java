//import java.util.ArrayList;

public class MyArray {

	public static void main(String[] args) {
		
	
  int[] secondArray= {100,200,300,400,500};
	    //secondArray[5]=0;
  for (int value2:secondArray) {
			System.out.println(value2);		
			
			boolean [] thirdArray= new boolean[4];
			thirdArray[0]=true;
		thirdArray[1]=true;
			for (boolean i :thirdArray ) {
				System.out.println(i);
			String [] striArray= new String [5] ;
			striArray[0]="Gautier";
			striArray[1]="HAYET";
			striArray[2]="Gautier";
			striArray[3]="JONAS";
		
			
			
			for (String  j :striArray ) {
				System.out.println(j);
				
			}
				
			String []value = {"peter","Jonas","Helene","arc"};
			System.out.println(value.length);
			for (String value3 : value) {
				System.out.println(value3);	
			}
			System.out.println(args.length);
			for (String string : args) {
				
				System.out.println(string);	
			}
			
			}
			
					
			int [] firstArray = new int[5];
			firstArray[0]=10; // Affecter le tableau 
firstArray[1]=45;
			firstArray[2]=34;
			firstArray[3]=10;
			firstArray[4]=10;
			for (int value:firstArray) {
				System.out.println(value);
			}
				
				
		
for (int  value :firstArray) { // pour parcourir le tableau, j'ai besoin une boucle for qui prend les elements de mon taleau  
			System.out.println(value);// pour afficher les valeurs 
			}
		}
	}
}
	
 
