package panel.quiz;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JOptionPane;

import de.example.quizdata.objects.Question;
import de.example.quizui.element.AppPanel;
import panel.header.HeaderPanel;

/**
 * Hauptpanel für das Quiz.
 */
public class QuizPanel extends AppPanel {

    private List<Question> questions;

    private InfoPanel infoPanel;
    private QuestionPanel questionPanel;
    private AnswerPanel answerPanel;

    private HeaderPanel header;

    private int questionNumber = 0;

    public QuizPanel(List<Question> questions, HeaderPanel header) {

        super(new BorderLayout(0, 15));

        this.questions = questions;
        this.header = header;

        // Erste Frage holen
        Question question = questions.get(0);

        // QuestionPanel
        questionPanel = new QuestionPanel(question.getText());
        add(questionPanel, BorderLayout.NORTH);

        // AnswerPanel
        answerPanel = new AnswerPanel(question.getAnswers());
        answerPanel.setListener(header);

        add(answerPanel, BorderLayout.CENTER);

        // InfoPanel
        infoPanel = new InfoPanel(question.getInfo());
        add(infoPanel, BorderLayout.SOUTH);

        infoPanel.chef = this;
    }

    /**
     * Zeigt die nächste Frage an.
     */
    public void pleaseNextQuestion() {

        // Prüfen ob letzte Frage erreicht wurde
        if(questionNumber == questions.size() - 1) {

            JOptionPane.showMessageDialog(
                    null,
                    "Game over\nKeine weiteren Fragen"
            );

            return;
        }

        // Zur nächsten Frage wechseln
        questionNumber++;

        // Neue Frage holen
        Question nextQuestion = questions.get(questionNumber);

        // Header aktualisieren
        header.updateQuestionNumber(questionNumber);

        // Info aktualisieren
        infoPanel.showNextQuestion(
                nextQuestion.getInfo()
        );

        // Frage aktualisieren
        questionPanel.showNextQuestion(
                nextQuestion.getText()
        );

        // Antworten aktualisieren
        answerPanel.showNextQuestion(
                nextQuestion.getAnswers()
        );
    }
}