// In java block is started with opening curly braces and end with closing curly braces. 
//Scopes can be nested, For example when we create a block of code we are creatinf a new nested scope. 
//when this occurs, the outer scope encloses the inner scope. 
//This means that objects declared in the outer scope will be visible to code within the inner scope, however the reverse is not true

//demonstrate block scope.
class Scope{
	public static void main(String args[]){

		int x; // known to all code within main
		
		x=10;
		if(x==10){//start of a new scope
		int y=20;
		
		//x and y are both known here
		System.out.println("x and y are "+x+" "+y);
		x=y*2;	

		}//end of the if scope
		//y=100; //error: y is not known here
	//x is still known here
	System.out.println("The value of x is "+x);
	}
}