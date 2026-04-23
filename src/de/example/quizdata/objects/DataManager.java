package de.example.quizdata.objects;

public class DataManager {
	
	
	public static Quiz createSampleQuiz() {
		
		Quiz quiz = new Quiz("Quiz");
		
		Question q1 = new Question("Was ist das?");
		q1.addAnswer("das", true);
        q1.addAnswer("es", false);
        q1.addAnswer("sie", false);
        q1.addAnswer("er", false);
		
        
        Question q2 = new Question("Was ist das?");
		q2.addAnswer("das", false);
        q2.addAnswer("es", false);
        q2.addAnswer("sie", true);
        q2.addAnswer("er", false);
		return quiz;
		
	}
	

}
