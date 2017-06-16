//java defines several type promotion rules that are applied to the expressions

class TypePromotion{
	public static void main(String args[]){
		byte b=42;
		char c='a';
		short s=1024;
		int i=50000;
		float f=5.67f;
		double d=.1234;
		double result=(f*b)+(i/c)-(d*s);
		System.out.println((f*b)+" + "+(i/c)+" - "+(d*s));
		System.out.println("result = "+result);
	}
}

// Here in the first subexpression f*b, b is promoted to a float and the result of the subexpression is float
// next in the subexpression i/c, c is promoted to int and the result of the expression is an int
// then in the subexpression d*s, s is promoted to double and the result of the expression is a double
// finally these three intermediate values, float , int and double are considered.
// the outcome of float plus an int is a float. then the resultant float minus the double is promoted to double
//hence the final result is of type double.