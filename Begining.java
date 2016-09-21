import javax.swing.JOptionPane;

public class Begining {

	public static void main(String[] args) {
		/*
		 * the first know secret code
		 * it is an alphabet shift
		 * start with plain text, and a "key"
		 * lets say key = 2, and 
		 * plain text is abc
		 * then a + 2 = c
		 * b + 2 = d
		 * c + 2 = e
		 * so secret code for abc is cde
		 * deciphering the code is just the reversing of the key
		 * 
		 * 
		 * Graded Requirements
		 * part one - the first grade
		 * 0. use a jop to ask for plainText, then
		 * 1. fix the space problem ( use an if to test for space, if yes add a space to codedText)
		 * 2. fix the z wrap (if index + key > 25 then subtract 25
		 * example z + 2 is 25 + 2 = 27
		 * so from above 27 - 25 = 2 = b perfect
		 * 
		 * for this part, syso is just fine
		 * 
		 * Next part 2
		 * add decoding knowing the key -- reverse the process
		 * 
		 * next part 3
		 *  crack a code where you do not know the key
		 *  JOP'd and jar's -- at the very end
		 */
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int key = 2;
		String plainText = "";
		String codedText = "";
		String original = "";
		int indexPlainText = 0;
		int indexShifted = 0;
		
		// one baby step at a time -- couple lines of code and test....
		
		plainText = JOptionPane.showInputDialog("What phrase would you like to cypher");
		plainText = plainText.toLowerCase();	
		original = plainText;

		for(int i = 0; i < plainText.length(); i++){
		indexPlainText = alpha.indexOf(plainText.charAt(i));
		
		if (indexPlainText > 25){
			indexShifted= indexPlainText - 25;
			codedText = codedText + alpha.charAt(indexShifted);
		}
		else{
		indexShifted = indexPlainText + key;	
		codedText = codedText + alpha.charAt(indexShifted);
		
		}
	}//end of loop
		
		System.out.println("Original = " + original);
		System.out.println("Key = " + key);
		System.out.println("Secret Code Msg = " + codedText);
		
		
	}//end of class

}
