package cs1120;
import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {
  String answer;

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	answer = e.getActionCommand();
	dispose(); 
	
}

 
}
