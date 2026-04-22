package de.example.quizdata;

public class DataManager {
	
	
	public static Quiz createSampleQuiz() {
		
		Quiz quiz = new Quiz("Quiz");
		
		Question q1 = new Question("Was ist das?");
		q1.addAnswer("das", true);
        q1.addAnswer("es", false);
        q1.addAnswer("sie", false);
        q1.addAnswer("er", false);
		
		return quiz;
		
	}
	

}
