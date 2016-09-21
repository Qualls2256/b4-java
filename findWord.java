package stringsintro_001;

import javax.swing.JOptionPane;

public class findWord {

	public static void main(String[] args) {
		/*
		 * What is your word?
		 * input - abc
		 * reverse front to back
		 * output - cba
		 */
		String myWord = "";
		String outputTxt = "";
		int myNumber = 0;		
		
		myWord = JOptionPane.showInputDialog("What is the word you would like to use");
		for (int i = myWord.length(); i >= 0; i--){
			
			outputTxt += myWord;
				
			}
			
			
		}
		
		//System.out.println("output text is " + outputTxt );

	}


