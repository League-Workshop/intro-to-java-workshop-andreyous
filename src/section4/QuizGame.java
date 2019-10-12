package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("Do you know Joe?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("Joe Mama"));
		// 4.  if the user's answer was correct, add one to their score 
		score++;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2=JOptionPane.showInputDialog("Have u ever seen a dragon?");
		if(answer.equals("nut"));
		score++;
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Score: " +score);
	}
}
