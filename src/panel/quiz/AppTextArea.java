package panel.quiz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class AppTextArea extends JTextArea {

	public AppTextArea() {
		super();
		initialize();
	}
		
	private void initialize() {	
	
	this.setLineWrap(true);
        setWrapStyleWord(true);
        setEditable(false);
        setFont(new Font("SansSerif", Font.PLAIN, 18));
        setBackground(Color.WHITE);

        setText(
            "Klassen in Java können beliebig viele Methoden enthalten.\n"
            + "Die Anzahl ist grundsätzlich nicht fachlich auf 1, 64 oder 0 begrenzt.\n\n"
            + "Diese Oberfläche bildet nur das Mockup nach.\n"
            + "Logik, Auswertung und Persistenz sind bewusst nicht enthalten."
        );
    }

}
	
	


