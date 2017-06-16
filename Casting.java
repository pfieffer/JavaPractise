// if two types are compatible they are implicitly converted by the java compiler
// no explicit casting is required. example we can assign an int value to a long variable

// java's automatic conversion is done when following two criterias are met:
//1. The two types are compatible: int and long, numeric types to boolean or char is incompatible
//2. The destination type is larger than than the source type: widening conversion: int type is large enough to hold all byte values

//casting incompatible types
//example assign an int value to a byte variable. not performed automatically because a byte type is always smaller than int
//requires casting, also called narrowing conversion
//syntax (target-type) value
/* int a;
	byte b;
	//.....
	b= (byte)a;
*/

class Casting{
	public static void main(String args[]){
		byte b;
		int i=257;
		double d=323.142;

		System.out.println("Conversion of int to byte:");
		b=(byte)i;
		System.out.println("Integer value i is "+i+"\nByte value b after casting i to b is "+b);
		
		System.out.println("\nConversion of double to byte:");
		b=(byte)d;
		System.out.println("Double value d is "+d+"\nByte value b after casting d to b is "+b);
		
		System.out.println("\nConversion of double to int:");
		i=(int)d;
		System.out.println("Double value d is "+d+"\nInt value i after casting d to i is "+i);
	
	}
}

//when the value 257 is cast into a byte variable, the result is the remainder of division of 257 by 256(which is the range of a byte type), which is 1 in this case
// so the first casting will result to 1

//when d is converted to a byte, the fractional component is lost, and the value is reduced modulo 256, which in this case is 67

//when d is converted to an int, its fractional component is lost.
