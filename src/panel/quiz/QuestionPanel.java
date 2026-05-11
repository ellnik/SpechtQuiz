package panel.quiz;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import de.example.quizdata.objects.Question;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

/**
 * Panel für die Anzeige der aktuellen Frage.
 */
public class QuestionPanel extends AppPanel {

	//private AppLabel questionLabel = new AppLabel("");
	private JTextArea questionArea = new JTextArea();

	/**
	 * Erstellt das Fragen-Panel.
	 * 
	 * @param subjecttitle
	 * @param questiontext
	 */
	public QuestionPanel( String questiontext) {
		initializePanel();
		buildLayout();
		questionArea.setText(questiontext);
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createCompoundBorder(UIConstants.QP_MATTE_BORDER,
				UIConstants.QP_EMPTY_BORDER));
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die enthaltenen Komponenten des Panels auf.
	 */
	private void buildLayout() {

		  questionArea.setLineWrap(true);
		   questionArea.setWrapStyleWord(true);
		    questionArea.setEditable(false);
		    questionArea.setFocusable(false);
		    questionArea.setBackground(Color.WHITE);
		    questionArea.setFont(new Font("Arial", Font.PLAIN, 24));		   
		    add(questionArea, BorderLayout.CENTER);
		}
	public void showNextQuestion(String text) {
		questionArea.setText(text);
		
	}
}