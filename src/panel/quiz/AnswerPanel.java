package panel.quiz;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppRadioButton;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.GridLayout;

/**
 * Panel für die Anzeige der auswählbaren Antwortoptionen.
 */
public class AnswerPanel extends AppPanel {

    /**
     * Gruppiert die Radio-Buttons, damit nur eine Antwort auswählbar ist.
     */
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Erstellt das Antwort-Panel.
     */
    public AnswerPanel() {
        initializePanel();
        buildLayout();
        
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
    private void buildLayout() {
        addAnswerOption("keine");
        addAnswerOption("1");
        addAnswerOption("64");
        addAnswerOption("egal wie viele");
    }

    /**
     * Fügt dem Panel eine einzelne Antwortoption hinzu.
     *
     * @param text Beschriftung der Antwortoption
     */
    private void addAnswerOption(String text) {
        AppRadioButton radioButton = new AppRadioButton(text);
        buttonGroup.add(radioButton);
        add(radioButton);
    }
}
