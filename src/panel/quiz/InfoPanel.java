package panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import de.example.quizdata.objects.Answer;
import de.example.quizui.UIConstants;
import de.example.quizui.element.AppButton;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppTextArea;

/**
 * Panel für zusätzliche Informationen zur aktuellen Frage oder Antwort.
 */
public class InfoPanel extends AppPanel {

	private AppTextArea infoArea;
	QuizPanel chef;

	/**
	 * Erstellt das Info-Panel.
	 * 
	 * @param info
	 */
	public InfoPanel(String info) {
		initializePanel();
		buildLayout();
		infoArea.setText(info);
		infoArea.setVisible(true);
	}
	

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new BorderLayout(0, 10));
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
				BorderFactory.createEmptyBorder(15, 15, 15, 15)));
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die enthaltenen Komponenten des Panels auf.
	 */
	private void buildLayout() {
		
		AppButton buttonHint = new AppButton("Info anzeigen");
		buttonHint.setActionCommand("Info");
		buttonHint.addActionListener(e -> {
			infoArea.setVisible(true);
			});
		
		AppButton buttonNext = new AppButton("Nächste Frage");
		add(buttonNext, BorderLayout.EAST);
		buttonNext.addActionListener(e -> nextQuestion());
	
		infoArea = new AppTextArea();
		JScrollPane scrollPane = new JScrollPane(infoArea);
		add(scrollPane, BorderLayout.SOUTH);
	}
	private void nextQuestion() {
		chef.pleaseNextQuestion();
		
	}


	public void showNextQuestion(String text) {
	    infoArea.setText(text);

		
	}
}
