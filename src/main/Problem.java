package main;

//contains the model of a randomly generated math problem
public class Problem {
	private int A;
	private int B;
	private int result;
	private String type;
	private boolean corr;
	
	public int getA(){return A;}
	public int getB(){return B;}
	public int getResult(){return result;}
	public String getType(){return type;}
	
	//returns a string representing the problem
	public String problemString(){
		String ret = "";
		ret+=A + " " + type + " " + B + " = ";
		return ret;
	}
	//returns a string representing the problem and whether the input was correct or incorrect
	public String productString(){
		String ret = "";
		if(corr){
			ret+=A + " " + type + " " + B + " = " + result + " Correct!";
		}
		else{
			ret+=A + " " + type + " " + B + " = " + result + " Incorrect!";
		}
		return ret;
	}
	
	//returns true if the parameter is equal to the result
	public boolean correct(int x){
		if(result==x){
			corr = true;
			return true;
		}
		else{
			corr = false;
			return false;
		}
	}
	
	//creates a Problem object with two constant ints, a result int, and a String representing the operation.
	public Problem(int a, int b, int res, String typ){
		A=a;
		B=b;
		result=res;
		type=typ;	
	}
	
}
