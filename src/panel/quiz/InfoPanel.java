package panel.quiz;

import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Panel für zusätzliche Informationen zur aktuellen Frage oder Antwort.
 */
public class InfoPanel extends AppPanel {

    /**
     * Erstellt das Info-Panel.
     */
    public InfoPanel() {
        initializePanel();
        buildLayout();
    }

    /**
     * Initialisiert Layout, Rahmen und Hintergrund des Panels.
     */
    private void initializePanel() {
        setLayout(new BorderLayout(0, 10));
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
        AppLabel infoLabel = new AppLabel("Info:");

        AppTextArea infoArea = new AppTextArea();
        JScrollPane scrollPane = new JScrollPane(infoArea);

        add(infoLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
  }

   //Dies all soll in den Konstruktor der neuen Klasse AppTextArea
  /*  private JTextArea buildInfoArea() {
        JTextArea infoArea = new JTextArea();
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        infoArea.setEditable(false);
       // infoArea.setFont(new Font("SansSerif", Font.PLAIN, 18));
        infoArea.setBackground(Color.WHITE);
        infoArea.setText(
                "Klassen in Java können beliebig viele Methoden enthalten.\n"
                        + "Die Anzahl ist grundsätzlich nicht fachlich auf 1, 64 oder 0 begrenzt.\n\n"
                        + "Diese Oberfläche bildet nur das Mockup nach.\n"
                        + "Logik, Auswertung und Persistenz sind bewusst nicht enthalten."
        );
        return infoArea;
    }
    */

