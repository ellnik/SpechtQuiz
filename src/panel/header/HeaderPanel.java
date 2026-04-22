package panel.header;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppBigLabel;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Panel für den oberen Kopfbereich der Oberfläche.
 * Es zeigt den aktuellen Fragenfortschritt sowie die Anzahl
 * der richtig beantworteten Fragen an.
 */
public class HeaderPanel extends AppPanel {

    /**
     * Erstellt das Kopfbereich-Panel.
     */
    public HeaderPanel() {
        initializePanel();
        buildLayout();
    }

    /**
     * Initialisiert Layout, Rahmen und Hintergrund des Panels.
     */
    private void initializePanel() {
        setLayout(new BorderLayout());
        setBorder(UIConstants.HP_COMPOUD_BORDER);
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
        AppBigLabel questionCounterLabel = new AppBigLabel("Frage 10 / 16");

        AppBigLabel scoreLabel = new AppBigLabel("Richtig: 2 / 10", SwingConstants.RIGHT);

        add(questionCounterLabel, BorderLayout.WEST);
        add(scoreLabel, BorderLayout.EAST);
    }
}
