package panel.quiz;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JOptionPane;

import de.example.quizdata.objects.Question;
import de.example.quizui.element.AppPanel;

public class QuizPanel extends AppPanel{

	
	List<Question> questions;
	InfoPanel infoPanel;
	private QuestionPanel questionPanel;
	private AnswerPanel answerPanel;
	
	public QuizPanel(List<Question> questions) {
		super(new BorderLayout(0, 15));
		this.questions = questions;
		
		
		
		//TODO check for questions == null and questions.size() == 0;
		Question question = questions.get(0);
		
		questionPanel = new QuestionPanel(question.getSubject().getTitle(), question.getText());
		add(questionPanel, BorderLayout.NORTH);
		
		answerPanel = new AnswerPanel(question.getAnswers());
		add(answerPanel, BorderLayout.CENTER);
				
		infoPanel = new InfoPanel(question.getInfo());
		add(infoPanel, BorderLayout.SOUTH);
		infoPanel.chef = this;
	}

	public void pleaseNextQuestion() {
	//	JOptionPane.showMessageDialog(null, "Mach ich gleich");
		
		Question nextQuestion = questions.get(1);
		
		infoPanel.showNextQuestion(nextQuestion.getInfo());
		
		//Fragetext auf dem AnswerPanel austauschen
		questionPanel.showNextQuestion(nextQuestion.getText());
		
		
		//Aufgabe: Answers auf dem AnswerPanel austauschen
		answerPanel.showNextQuestion(nextQuestion.getAnswers());

	}
}