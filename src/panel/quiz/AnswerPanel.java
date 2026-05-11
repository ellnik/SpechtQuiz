package panel.quiz;

import de.example.quizdata.objects.Answer;
import de.example.quizui.QuizState;
import de.example.quizui.UIConstants;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppRadioButton;
import panel.AnswerPanelListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Panel für die Anzeige der auswählbaren Antwortoptionen.
 */
public class AnswerPanel extends AppPanel {
	
	private AnswerPanelListener listener;

	List<AppRadioButton> radioButtons;
	ButtonGroup buttonGroup;

	/**
	 * Erstellt das Antwort-Panel.
	 * 
	 * @param list
	 */
	public AnswerPanel(List<Answer> list) {

		radioButtons = new ArrayList <AppRadioButton>(list.size());
		initializePanel();
		buildLayout(list);
	}

	public AnswerPanelListener getListener() {
		return listener;
	}


	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new GridLayout(4, 1, 0, 18));
		setBorder(UIConstants.AP_EMPTY_BORDER);
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die Antwortoptionen des Panels auf.
	 */
	private void buildLayout(List<Answer>list) {
		 buttonGroup = new ButtonGroup();
		
		for (Answer answer : list) {
			AppRadioButton radioButton = new AppRadioButton(answer);
			buttonGroup.add(radioButton);
			radioButtons.add(radioButton);
			add(radioButton);
			
			radioButton.addActionListener(e -> checkAnswer(e));
		}

	}
	
public void showNextQuestion(List<Answer> answers) {
	        	
	     answered = false;
	        buttonGroup.clearSelection();
	        
	        for(int i = 0; i < radioButtons.size(); i ++) {
			AppRadioButton radioButton = radioButtons.get(i);
			Answer ans = answers.get(i);
			
			radioButton.setAnswer(ans);
	        radioButton.setForeground(Color.BLACK);

			  
		}
		
	}
	private boolean answered = false;
	
	public void checkAnswer(ActionEvent e) {

	    if(e.getSource() instanceof AppRadioButton) {
	        if(answered) {
	            JOptionPane.showMessageDialog(
	                null,
	                "Du hast die Antwort bereits ausgewählt; -)\nNeue Wahl wird nicht berücksichtigt."   );
	            return;
	        }

	        answered = true;
	        AppRadioButton rb = (AppRadioButton) e.getSource();

	        if(rb.isCorrect()) {
	            rb.setForeground(Color.GREEN);

	            if(listener != null) {
	                listener.upDateScore();
	            }

	        } else {
	            rb.setForeground(Color.RED);
	            for(AppRadioButton arb : radioButtons) {

	                if(arb.getAnswer().isCorrect()) {
	                    arb.setForeground(Color.GREEN);
	                }
	            }
	        }
	    }
	}

	public void setListener(AnswerPanelListener listener) {
	    this.listener = listener;
	}
}
