package de.example.quizui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

public abstract class UIConstants {
	
	//Konstanten für das QuizFrame
	public static final String APP_TITLE = "SpechtQuiz";
	public static final Dimension FRAME_DIMENSION = new Dimension(900, 800);
	
	//QuestionPanel_Konstanten
	public static final MatteBorder QP_MATTE_BORDER = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(180, 180, 180));
	public static final Border QP_EMPTY_BORDER = (MatteBorder) BorderFactory.createEmptyBorder(20, 20, 20, 20);
	
    //AnswerPanel _ KOnstanten
	public static final Border AP_EMPTY_BORDER = BorderFactory.createEmptyBorder(20, 30, 20, 30);
	
	
	//HeaderPanel-Konstants
    static Border outsideBorder = BorderFactory.createLineBorder(new Color(180, 180, 180), 1);
    static Border insideBorder = BorderFactory.createEmptyBorder(10, 15, 10, 15);
	public static final Border HP_COMPOUD_BORDER = BorderFactory.createCompoundBorder(outsideBorder,insideBorder);
	
}
	
	
	
	
	
	

