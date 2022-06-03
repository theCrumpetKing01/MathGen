package main;
import java.util.*;

import javax.swing.*;
//accepts input and stores the number of correct problems
public class View {
	private String problemList = "";
	private boolean runn = true;
	
	//generates a problem of an input type
	private Problem probGen(int x){
		ProblemGen proGen = new ProblemGen();
		if(x==0){
			return proGen.genAdd();
		}
		else if(x==1){
			return proGen.genSub();
		}
		else if(x==2){
			return proGen.genMul();
		}
		else{
			return proGen.genDiv();
		}
	}
	
	//runs the main loop and creates problems of the selected type until cancelled
	private void run(int x){
		int numRight = 0;
		int numWrong = 0;
		int numTotal = 0;
		String correctPerc = "0%";
		while(runn){
			Problem p = probGen(x);
			String str = JOptionPane.showInputDialog(problemList + "Correct: " + numRight + "\nIncorrect: " + numWrong + "\nPercentage correct: " + correctPerc + "\n" + p.problemString());
			if(str==null || str.equals("")){
				runn=false;
			}
			else{
				if(p.correct(Integer.valueOf(str))){
					numRight++;
					numTotal++;
				}
				else{
					numWrong++;
					numTotal++;
				}
				problemList+= p.productString() + "\n";
				correctPerc = "";
				correctPerc += (numRight*100)/(numTotal) + "%";
			}
			
		}
	}
	
	//creates a View object and accepts input for the problem types 
	public View(){
		Object[] options = {"Addition", "Subtraction", "Multiplication", "Division"};
		int opt = JOptionPane.showOptionDialog(null,"Select problem type: ", "Math problem generator",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, null);
		run(opt);
	}
	
	
}
