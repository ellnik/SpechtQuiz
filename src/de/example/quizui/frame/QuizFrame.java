package de.example.quizui.frame;

import panel.RootPanel;
import panel.header.HeaderPanel;
import panel.quiz.AnswerPanel;
import panel.quiz.InfoPanel;
import panel.quiz.QuestionPanel;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

/**
 * Hauptfenster der Quiz-Oberfläche.
 * <p>
 * Das Fenster enthält den Kopfbereich, den Fragenbereich, die Antwortoptionen,
 * die Ergebnisanzeige und den Infobereich. Es wird ausschließlich die GUI
 * aufgebaut, ohne fachliche Logik oder Persistenz.
 * </p>
 */
public class QuizFrame extends JFrame {


	/**
     * Erstellt das Hauptfenster und initialisiert alle enthaltenen GUI-Bereiche.
     */
    public QuizFrame() {
        initializeFrame();
        add(new RootPanel());
        setVisible(true);
    }

    /**
     * Initialisiert die grundlegenden Fenstereigenschaften.
     */
    private void initializeFrame() {
        setTitle(UIConstants.APP_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(UIConstants.FRAME_DIMENSION);
        setLocationRelativeTo(null);
        setResizable(true);
    }

  
 
}
