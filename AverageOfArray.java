class AverageOfArray{
	public static void main(String args[]){
		double num[] = {12.3, 14.6, 13.2, 15.8};
		double result = 0;
		int i=0;
		for(i=0; i<4; i++){
			result += num[i];		
			}
		System.out.println("The average of these numbers is "+result/4);
	}
}