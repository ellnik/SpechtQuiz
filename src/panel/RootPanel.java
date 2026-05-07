package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import de.example.quizdata.objects.Question;
import de.example.quizdata.objects.Quiz;
import de.example.quizui.QuizState;
import de.example.quizui.element.AppPanel;
import panel.header.HeaderPanel;
import panel.quiz.QuizPanel;

/**
 * Das Panel hält zwei separate Bereiche: Header und Quiz;<br>
 * Hält auch die Daten = den Quiz, der gespielt werden soll.
 */
public class RootPanel extends AppPanel {

	private HeaderPanel headerPanel;
	private QuizPanel quizPanel;

	public RootPanel(Quiz quiz) {
		super(new BorderLayout(0, 15));

		int questionCount = quiz.getQuestions().size();
		QuizState.questionCount = questionCount;
		
		headerPanel = new HeaderPanel(questionCount);
		add(headerPanel, BorderLayout.NORTH);
				
		Question question = null;
		if (quiz.getQuestions() != null && quiz.getQuestions().size() > 0)
			question = quiz.getQuestions().get(0);
		
		List<Question> liste = quiz.getQuestions();
		
		quizPanel = new QuizPanel(liste, headerPanel);
		add(quizPanel, BorderLayout.CENTER);
		
		
	}
	
	protected void initialize() {
    	super.initialize();
		setBackground(new Color (217, 242, 208));
    }

}