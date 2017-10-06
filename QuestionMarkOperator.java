// The ? operator is a Ternary(three way) operator, that can replace cerain types of if-then-else statements
public class QuestionMarkOperator{
	public static void main(String args[]){
		int numerator, denominator, ratio;
		numerator = 12;
		denominator = 3; //put 0 here to see the operator in action
		ratio = denominator==0 ? 0 : numerator/denominator; /* is denominator=0? If yes ratio=0 else ratio=numerator/denominator*/
		System.out.println("The ratio is "+ratio);
	}
}
