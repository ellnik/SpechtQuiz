package de.example.quizdata.objects;

public class Answer {
	
	private String text;
	private boolean correct;
	/**
	 * Repräsentiert eine Frage in einem Quiz.
	 * Eine Question besteht aus einem Text und mehreren möglichen Antworten.
	 * Die Klasse aggregiert Objekte der Klasse Answer.
	 */
	private Question questions;
	
	/**
	 * Konstruiert eine Instanz der Klasse.<br>
	 * Initialisiert das Feld text anhand des Parameters.<br>
	 * Uninitialisiert haben:
	 * das Feld text den Wert null, das Feld correct den Wert false.
	 *
	 * @param text
	 */
	public Answer(String text) {
		super();
		this.text = text;
	}
	/**
	 * Konstruiert eine Instanz der Klasse.<br>
	 * Initialisiert die Felder text und correct anhand der Parameter.
	 *
	 * @param text
	 * @param correct
	 */
	public Answer(String text, boolean correct) {
		this.text = text;
		this.correct = correct;
	}

	public String getText() {
		return text;
	}


	public boolean isCorrect() {
		return correct;
	}


	public Question getQuestion() {
		return questions;
	}

	public void setQuestion(Question questions) {
		this.questions = questions;
	}
	
	

}
