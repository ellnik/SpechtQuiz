package panel.header;

import de.example.quizui.QuizState;
import de.example.quizui.UIConstants;
import de.example.quizui.element.AppBigLabel;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;
import panel.AnswerPanelListener;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Panel für den oberen Kopfbereich der Oberfläche.
 * <p>
 * Es zeigt den aktuellen Fragenfortschritt sowie die Anzahl der richtig
 * beantworteten Fragen an.
 * </p>
 */
public class HeaderPanel extends AppPanel implements AnswerPanelListener{
	
	AppBigLabel questionCounterLabel;
	private AppBigLabel scoreLabel;
	private String scoreString = "Richtig: %d von %d";
	 private String questionString = "Frage %d";
	
	private int count;
	private int correctAnswered = 0;
	private int currentQuestion = 1;
	/**
	 * Erstellt das Kopfbereich-Panel.
	 * @param count = Anzahl der Fragen im Quiz
	 */
	public HeaderPanel(int count) {
		this.count = count;
		initializePanel();
		buildLayout();
	}

	private void initializePanel() {
		setLayout(new BorderLayout());
		setBorder(UIConstants.HP_COMPOUD_BORDER);
		setBackground(Color.WHITE);
	}

	private void buildLayout() {
		questionCounterLabel =  new AppBigLabel(questionString.formatted(currentQuestion) );		
		scoreLabel = new AppBigLabel(scoreString.formatted(correctAnswered, count), SwingConstants.RIGHT);

		add(questionCounterLabel, BorderLayout.WEST);
		add(scoreLabel, BorderLayout.EAST);
	}
	
	public void updateQuestionCounter() {
		++currentQuestion;
		  questionCounterLabel.setText(questionString.formatted(currentQuestion));
		 
	}

	@Override
	public void upDateScore() {
		scoreLabel.setText(scoreString.formatted(++correctAnswered, count));
	}
}