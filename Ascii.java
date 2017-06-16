class Ascii{
	public static void main(String[] args){
		char letter;
		int counter,asciiValue;
		letter=65;
		for(counter=0;counter<58;counter++)
		{
		asciiValue=letter;
		System.out.println("The character stored in x is "+letter+" whose ASCII value is "+asciiValue);			
		letter++;
		}
		
	}
}