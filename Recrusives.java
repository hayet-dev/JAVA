
public class Recrusives {
	
	public static long fact(long  value) {
		long accumulator =1;
		for (long i= 2; i < value; i++) {
			accumulator *=i;	
		}
		
		return accumulator;
	}
	public static long factRec(long value) {
		if(value == 0|| value ==1)return 1;
		return value*factRec(value-1);
				
	}
	
	public static int factoriel(int nbr) {
		if(nbr<0) {
		System.out.println("le nombre il doit étre entier >0");
		
	        return -1;
			}
			else {
				int rest=1;
				for (int i = 1; i <= nbr ; i++) {
					rest=rest*i;
				                                }
				return rest;
			}
	}
		
			
		       

		
		
	
		
		

	public static void main(String[] args) {
		
		System.out.println("[0!]===>:" +fact(0));//methode iterative 
		System.out.println("[1!]===>:" +fact(1));
		System.out.println("[5!]===>:" +fact(5));
		System.out.println("[6!]===>:" +fact(6));
		System.out.println("====================");//methode recursive 
		System.out.println("[0!]===>:" +factRec(0));
		System.out.println("[1!]===>:" +factRec(1));
		System.out.println("[5!]===>:" +factRec(5));
		System.out.println("[6!]===>:" +factRec(6));
		System.out.println("*********************");//methode recursive 2 avec for/if 
		System.out.println("[0!]===>:" +factoriel(0));
		System.out.println("[1!]===>:" +factoriel(1));
		System.out.println("[5!]===>:" +factoriel(5));
		System.out.println("[6!]===>:" +factoriel(6));

	}

}


