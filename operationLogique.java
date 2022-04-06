public class operationLogique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i>16;i++){
			String str= Integer.toBinaryString(i);
			while((str.length()<4)) str="0"+str;
			System.out.println(str);
				
		}
		
		int value1=0B010101001;
		int value2=0B000001111;
		//les opérations logique :
		
		System.out.println( " NOT :"  +Integer.toBinaryString(~ value1));
		System.out.println( " AND:"  +Integer.toBinaryString(value1 & value2));
		System.out.println( " OR:"  +Integer.toBinaryString(value1 | value2));
		System.out.println( " XOR:"  +Integer.toBinaryString(value1 ^ value2));
		
		//Opérateur de décalge de bits: 
		System.out.println( " >> :"  +Integer.toBinaryString(value1 >> 2));
		System.out.println( " << :"  +Integer.toBinaryString(value1 << 3));
		
		
		}

	

	}
