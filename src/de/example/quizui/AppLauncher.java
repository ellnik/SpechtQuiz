package de.example.quizui;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import de.example.quizui.frame.QuizFrame;

/**
 * Startklasse der Anwendung.
 * <p>
 * Diese Klasse initialisiert das Look-and-Feel und startet anschließend
 * das Hauptfenster der reinen Swing-GUI.
 * </p>
 */
public class AppLauncher {

    /**
     * Einstiegspunkt der Anwendung.
     *
     * @param args Kommandozeilenargumente, werden in dieser Anwendung nicht verwendet
     */
    public static void main(String[] args) {
 
            new QuizFrame();
        
    }

 
}
