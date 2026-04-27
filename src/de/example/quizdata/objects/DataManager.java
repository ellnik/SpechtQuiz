package de.example.quizdata.objects;

public class DataManager {
	
	
	public static Quiz createSampleQuiz() {
		
		Quiz quiz = new Quiz("Quiz");
		
		Question q1 = new Question("Wie viele Beine hat eine Spinne?");
        q1.setInfo("Spinnen im Gegensatz zu Insekten haben acht Beine."); 

		q1.addAnswer("Keine", false);
        q1.addAnswer("Vier", false);
        q1.addAnswer("Acht", true);
        q1.addAnswer("Zwanzig", false);
		
        
        Question q2 = new Question("Können Pinguine fliegen?");
        q2.setInfo("");

		q2.addAnswer("Nein", true);
        q2.addAnswer("Ja, nur paar Meter ", false);
        q2.addAnswer("sie", false);
        q2.addAnswer("er", false);
        
        
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        
        
		return quiz;
		
	}
	

}
