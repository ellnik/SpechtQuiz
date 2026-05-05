package de.example.quizui.element;

import javax.swing.JButton;

import de.example.quizui.UIConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * Generalisierte Basisklasse für Buttons der Anwendung.
 */
public class AppButton extends JButton {

    /**
     * Erstellt einen Button mit Text.
     *
     * @param text anzuzeigender Text
     */
    public AppButton(String text) {
        super(text);
        initialize();
    }

    /**
     * Initialisiert gemeinsame Basiseigenschaften des Buttons.
     */
    private void initialize() {
        setFocusPainted(false);
        setFont(UIConstants.FONT_TEXT);
        setBackground(new Color(230, 230, 230));
        setForeground(UIConstants.TEXT_COLOR_STANDARD);
        setPreferredSize(new Dimension(200, 30));
    }
}