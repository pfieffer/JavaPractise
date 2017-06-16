//manually allocate a differing size second dimension

class TwoDAgain{
	public static void main(String args[]){
		int twoD[][] = new  int[4][];
			// alternative array declaration
			//the above code can also be written as int[][] twoD = new int[4][]
		twoD[0] = new int[1]; //0th row ma 1 size ko array banaako
		twoD[1] = new int[2];	//1st row ma 2 size ko array banaako
		twoD[2] = new int[3]; 
		twoD[3] = new int[4];
		
		int i, j, k=0;
		for(i=0; i<4; i++){
			for(j=0; j<i+1; j++){
				twoD[i][j] = k;
				k++;	
			}
		}

		for(i=0; i<4; i++){
			for(j=0; j<i+1; j++){
				System.out.print(twoD[i][j]+" ");
					
			}
			System.out.println();
		}		
	}
}