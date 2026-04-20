package de.example.quizui;

import de.example.quizui.frame.QuizFrame;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

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
        SwingUtilities.invokeLater(() -> {
            setSystemLookAndFeel();
            new QuizFrame();
        });
    }

    /**
     * Setzt das native Look-and-Feel des Betriebssystems.
     * <p>
     * Falls das Setzen fehlschlägt, wird stillschweigend das Standard-Look-and-Feel
     * von Swing verwendet.
     * </p>
     */
    private static void setSystemLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
    }
}
