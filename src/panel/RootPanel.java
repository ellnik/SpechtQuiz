package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;

import de.example.quizdata.objects.Question;
import de.example.quizdata.objects.Quiz;
import de.example.quizui.element.AppPanel;
import panel.header.HeaderPanel;
import panel.quiz.QuizPanel;

public class RootPanel extends AppPanel {

	public RootPanel(Quiz quiz) {
		super(new BorderLayout(0, 15));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		setBackground(new Color(245, 245, 245));
		
		add(new HeaderPanel(), BorderLayout.NORTH);
		Question question = null;
		if(quiz.getQuestions() != null && quiz.getQuestions().size() > 0)
			
		question = quiz.getQuestions().get(0);
		add(new QuizPanel(question), BorderLayout.CENTER);
	}

	         
	     
}
