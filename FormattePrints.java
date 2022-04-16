//import java.io.File;
import java.util.Date;

public class FormattePrints {

	public static void main(String[] args) {
		
		int num=8;
		int den=11;
		//System.out.println("[" +num+"/"+den+"]");
		System.out.printf("[%d/%d]\n",num,den);
		
		String message=String.format("[%d/%d]",num,den);
		System.out.println(message);
		// formater les types entiers :
		System.out.printf(">%5d<\n",num);
		System.out.printf(">%05d<\n",num);
		System.out.printf(">%,d<\n" ,1_000_000_000);
		// formater en  d(digital) o(octet)  x(decimal) :
		
		System.out.printf("%d %o %x \n" ,num,num,num);
		//System.out.printf(">%08x< %o %x \n" ,num); 
		//formater en zero et x decimal
		
		// formater en  d(digital) o(octet)  x(decimal) :
		
		// formater en type float :
		System.out.printf("%f \n",Math.PI);

		System.out.printf("%5.2f \n",Math.PI);
		System.out.printf("%05.2f \n",Math.PI);
		System.out.printf("%11.4f",10000.256);// utilizés 4 float
		System.out.printf("%e\n",10000.256);// utilizé expentionel 
		
		//formated the charcter :
		//System.out.printf("%c  %s \n","z","zorro");
		System.out.printf(">%10s<\n","zorro");
		System.out.printf(">%10s<\n","zorro");//par dfaut aligné a droite 
		System.out.printf(">%-10s<\n","zorro");//aligner a gauche
		System.out.printf(">%10s< -->afficher le pourcentage: %%\n","zorro");//Afficher le pourcentage
		
		//...Formater des boolean : 
		System.out.printf("%b\n",true);
		System.out.printf("%h\n", new Date());
		System.out.printf("%tF %tT", new Date(),new Date());// la console donne resultat :2022-04-07 22:09:15
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
	}
}