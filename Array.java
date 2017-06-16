class Array{
	public static void main(String args[]){
		int month_days[]; // initialise an array of integer, month_days is a variable name
		month_days = new int[12]; // the array of integers month_days is set to an array of size 12, further each array element will be initialized to 0
		//or above two lines of code can be written in a single line of code as int month_days = new int[12]
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;

		System.out.println("April has "+month_days[3]+" days.");
	}
}