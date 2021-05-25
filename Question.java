package cs1120;
import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;	
	QuestionDialog question;
	String correctAnswer;	
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	//CONSTRUCTOR QUESTION
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("   "+question+" 	",JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
	
	// method check that take question and check the correct answer	
	void check() {
		// increment questions each time 
		nQuestions ++; 
		//a method "ask" that asks the question
		String answer = ask();		
		if (answer.equals(correctAnswer)) {
			 // increment correct answers for correct answers
			nCorrect ++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is "+ correctAnswer);
		}
		
	}
	
	static void showResults() {
		// show the number of questions and correct answers
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions ");

	}

}
