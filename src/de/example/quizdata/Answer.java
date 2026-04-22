package de.example.quizdata;

public class Answer {
	
	private String text;
	private boolean correct;
	private Question questions;
	
	
	public Answer(String text) {
		super();
		this.text = text;
	}
	
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
