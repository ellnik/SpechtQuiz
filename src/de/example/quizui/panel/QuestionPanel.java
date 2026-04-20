package de.example.quizui.panel;

import de.example.quizui.ui.AppLabel;
import de.example.quizui.ui.AppPanel;

import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Panel für die Anzeige der aktuellen Frage.
 */
public class QuestionPanel extends AppPanel {

    /**
     * Erstellt das Fragen-Panel.
     */
    public QuestionPanel() {
        initializePanel();
        buildLayout();
    }

    /**
     * Initialisiert Layout, Rahmen und Hintergrund des Panels.
     */
    private void initializePanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(180, 180, 180)),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
        AppLabel questionLabel = new AppLabel(
                "<html>Wie viele Methoden<br>kann eine Klasse haben?</html>"
        );
        questionLabel.setAppFontStyle(Font.PLAIN, 34);

        add(questionLabel, BorderLayout.CENTER);
    }
}
