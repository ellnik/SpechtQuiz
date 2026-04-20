package de.example.quizui.panel;

import de.example.quizui.ui.AppLabel;
import de.example.quizui.ui.AppPanel;

import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Panel für die Ergebnisrückmeldung zur gegebenen Antwort.
 */
public class ResultPanel extends AppPanel {

    /**
     * Erstellt das Ergebnis-Panel.
     */
    public ResultPanel() {
        initializePanel();
        buildLayout();
    }

    /**
     * Initialisiert Layout, Rahmen und Hintergrund des Panels.
     */
    private void initializePanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
        AppLabel resultLabel = new AppLabel("Deine Antwort ist falsch.");
        resultLabel.setAppFontStyle(Font.BOLD, 24);
        resultLabel.setForeground(new Color(150, 30, 30));

        add(resultLabel, BorderLayout.WEST);
    }
}
