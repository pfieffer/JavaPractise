public class primitives{
//the primitives with their default values
	public static void main(String[] args){
		byte myByte=0;//0000 0000 (eight tranisistors at 0 state each) 8 bits = 1 byte
		short myShort=0; //0000 0000 0000 0000 (16 bits)
		int myInt=0; //0000 0000 0000 0000 0000 0000 0000 0000 (32 bits)
		long myLong=0; //(64 bits)
		float myFloat = 0.0f; //32 bits
		double myDouble = 0.0d; //64 bits
		char myChar = '\u0000'; //16 bits \u0000 is the default value (which is essentially a blank space)
		boolean myBoolean = false; //default value is false
		System.out.println(myByte+"\n"+myShort+"\n"+myLong+"\n"+myFloat+"\n"+myDouble+"\n"+myChar+"\n"+myBoolean);
	
	}
}
