class DynamicInit{
	public static void main(String args[]){
		double a=3.0,b=4.0;
		
		//c is dynamically initialized
		double c= Math.sqrt(a*a+b*b);

		System.out.println("The hypotenuse is "+c);
	}

}