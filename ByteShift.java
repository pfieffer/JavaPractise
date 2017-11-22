class ByteShift{
	public static void main(String args[]){
		byte a=64, b;
		int i;
		i = a<<2; //left shift a by 2 and assign to 1. the value of a is 64 ie. 0100 0000, left shifting by 2 results in 1 0000 0000 (which is 256 in integer)

		b = (byte) (a << 2); //This will output 0, because after the shift, the low-order byte is now zero
		System.out.println("Original value of a is "+a);
		System.out.println("Value of i and b is "+i+" "+b);
	}
}
