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
	private String scoreString = "Rictig: %d von %d";
	
	private int count;
	private int correctAnswered = 0;
	/**
	 * Erstellt das Kopfbereich-Panel.
	 * @param count = Anzahl der Fragen im Quiz
	 */
	public HeaderPanel(int count) {
		this.count = count;
		initializePanel();
		buildLayout(count);
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new BorderLayout());
		setBorder(UIConstants.HP_COMPOUD_BORDER);
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die enthaltenen Komponenten des Panels auf.
	 */
	private void buildLayout(int count) {
		questionCounterLabel = new AppBigLabel("Frage 1");
		 scoreLabel = new AppBigLabel(scoreString.formatted(correctAnswered, count), SwingConstants.RIGHT);

		add(questionCounterLabel, BorderLayout.WEST);
		add(scoreLabel, BorderLayout.EAST);
	}

	@Override
	public void upDateScore() {
		scoreLabel.setText(scoreString.formatted(++correctAnswered, count));
	}
}