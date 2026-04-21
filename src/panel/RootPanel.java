package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;

import de.example.quizui.element.AppPanel;
import panel.header.HeaderPanel;
import panel.quiz.QuizPanel;

public class RootPanel extends AppPanel {

	public RootPanel() {
		super(new BorderLayout(0, 15));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		setBackground(new Color(245, 245, 245));
		
		add(new HeaderPanel(), BorderLayout.NORTH);
		add(new QuizPanel(), BorderLayout.CENTER);
	}

	         
	     
}
