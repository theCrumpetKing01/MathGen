package main;

//generates a random math problem of a given type. Uses the default constructor.
public class ProblemGen {
	private static final String ADD = "+";
	private static final String SUB = "-";
	private static final String MUL = "x";
	private static final String DIV = "÷";
	private int A = (int) (Math.random()*1000);
	private int B = (int) (Math.random()*1000);
	private int AA = (int) (Math.random()*32)+1;
	private int BB = (int) (Math.random()*32)+1;
	
	//generates a random addition problem
	public Problem genAdd(){
		Problem ret = new Problem(A, B, A+B, ADD);
		return ret;
	}
	
	//generates a random subtraction problem
	public Problem genSub(){
		Problem ret;
		if(A>B){
			ret = new Problem(A, B, A-B, SUB);
		}
		else{
			ret = new Problem(B, A, B-A, SUB);
		}
		return ret;
	}
	
	//generates a random multiplication problem
	public Problem genMul(){
		Problem ret = new Problem(A, B, A*B, MUL);
		return ret;
	}
	
	//generates a random division problem
	public Problem genDiv(){
		Problem ret = new Problem(AA*BB, AA, BB, DIV);
		return ret;
	}
}
